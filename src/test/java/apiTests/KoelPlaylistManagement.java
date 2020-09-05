package apiTests;

import helpers.DbAdapter;
import helpers.RandomGenerator;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class KoelPlaylistManagement {
    private String token;
    private int playlistId;
    @BeforeClass
    public void runBeforeClassOnlyOneTime(){
        token = Token.get();
    }
    @AfterMethod
    public void tearDown(){
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist/"+playlistId)
                        .header("Authorization","Bearer "+token)
                        .delete();
    }
    @Test
    public void createPlaylist(){
        String newName = RandomGenerator.randomStringGenerator(8);
        System.out.println(newName);
        Playlist newPlaylist = new Playlist(newName);
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("Content-Type","application/json")
                        .header("Authorization","Bearer "+token)
                        .body(newPlaylist)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath jsonPath = response.jsonPath();
        Playlist playlistResponse = jsonPath.getObject("$",Playlist.class);
        playlistId = playlistResponse.id;
        Assert.assertEquals(newName,playlistResponse.name);

        Playlist playlistFromDatabase = DbAdapter.getPlaylistById(playlistId);
        Assert.assertEquals(newName,playlistFromDatabase.name);
    }
}
