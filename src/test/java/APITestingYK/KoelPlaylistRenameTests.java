package APITestingYK;

import ModelsYK.PlaylistsResponse;
import ModelsYK.PostPlaylistRequest;
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
                .delete()
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    @Test
    public void renamePlaylist (){
        var putRequest = RandomGenerator.postPlaylistRequestGenerator();
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
    }
}
