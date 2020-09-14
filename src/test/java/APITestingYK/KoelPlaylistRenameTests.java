package APITestingYK;

import ModelsYK.Playlists;
import ModelsYK.PlaylistsResponse;
import ModelsYK.PostPlaylistRequest;
import helpersYK.DbAdapter;
import helpersYK.RandomGenerator;
import helpersYK.Token;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class KoelPlaylistRenameTests {
    private String token;
    private int playlistId;

    @BeforeClass
    public void testGetToken() {
        token = Token.getNewToken();
    }

    @BeforeMethod
    public void postNewPlaylist() {
        var playlistRequest = RandomGenerator.postPlaylistRequestGenerator();
        var response =
                given()
                        .baseUri("https://koelapp.testpro.io")
                        .basePath("/api/playlist")
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer" + token)
                        .body(playlistRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        var jsonPath = response.jsonPath();
        var playlistResponse = jsonPath.getObject("$", PlaylistsResponse.class);
        playlistId = playlistResponse.getId();
    }

    @AfterMethod
    public void deletePlaylist(){
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization", "Bearer" + token)
                .when()
                .delete();
    }

    @Test
    public void renamePlaylist (){
        var newName = RandomGenerator.randomStringGenerator(4);
        var putRequest = new PostPlaylistRequest(newName);
        putRequest.setId(playlistId);
        var response =
            given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization", "Bearer" + token)
                .header("Content-Type", "application/json")
                .body(putRequest)
                .when()
                .put()
                .then()
                .statusCode(200)
                .extract()
                .response();
        var jsonPath = response.jsonPath();
        var playlistResponse = jsonPath.getObject("$", PostPlaylistRequest.class);
        System.out.println(playlistResponse.getId() + " " + playlistResponse.getName());
        Assert.assertEquals(playlistResponse.getName(), putRequest.getName());
        Playlists plFromDb = DbAdapter.getPlaylistById(playlistId);
        Assert.assertEquals(putRequest.getName(), plFromDb.getName());
    }
}
