package APITestingYK;

import ModelsYK.Playlists;
import ModelsYK.PlaylistsResponse;
import helpersYK.DbAdapter;
import helpersYK.RandomGenerator;
import helpersYK.Token;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class KoelPlaylistsCreateTests {
    private String token;
    private int playlistId;

    @BeforeClass
    public void testGetToken() {
        token = Token.getNewToken();
    }

    @AfterMethod
    public void deletePlaylist(){
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization", "Bearer" + token)
                .delete();
    }

    @Test
    public void postNewPlaylist(){
        var playlistRequest = RandomGenerator.postPlaylistRequestGenerator();
        var response =
                given()
                        .baseUri("https://koelapp.testpro.io")
                        .basePath("/api/playlist")
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer"+token)
                        .body(playlistRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        var jsonPath = response.jsonPath();
        var playlistResponse = jsonPath.getObject("$", PlaylistsResponse.class);
        playlistId=playlistResponse.getId();
        Assert.assertEquals(playlistRequest.getName(), playlistResponse.getName());
        System.out.println(playlistResponse.getName());
        System.out.println(playlistResponse.getId());
        Playlists plFromDb = DbAdapter.getPlaylistById(playlistId);
        Assert.assertEquals(playlistRequest.getName(), plFromDb.getName());
    }
}
