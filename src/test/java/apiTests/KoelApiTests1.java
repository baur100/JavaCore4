package apiTests;

import helpers.Token;
import models.DataResponse;
import models.Playlist;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class KoelApiTests1<jsonPath> {
    private String token;
    @BeforeClass
    public void starOneTime(){

        token = Token.get();
    }

//    @Test
//    public void getCurrentUserPlaylist(){
//        var response =
//                given()
//                        .baseUri("https://koelapp.testpro.io/")
//                        .basePath("api/playlist")
//                        .header("Authorization","Bearer "+token)
//                        .when()
//                        .get()
//                        .then()
//                        .statusCode(200)
//                        .extract()
//                        .response();
//        var jsonPath = response.jsonPath();
//
/////
//        var playlists = jsonPath.getObject("playlists", Playlist[].class);
//        System.out.println(playlists());
//    }
//
//    private String playlists() {
//        return playlists();
//    }

}

