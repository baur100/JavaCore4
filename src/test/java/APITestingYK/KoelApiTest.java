package APITestingYK;

import ModelsYK.DataResponse;
import ModelsYK.Playlists;
import ModelsYK.PlaylistsResponse;
import ModelsYK.PostPlaylistRequest;
import helpersYK.DbAdapter;
import helpersYK.RandomGenerator;
import helpersYK.Token;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class KoelApiTest {
    private String token;

    @BeforeClass
    public void testGetToken() {
        token = Token.getNewToken();
    }

    @Test
    public void getData() {
        var response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/data")
                        .header("Authorization", "Bearer" + token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        var jsonPath = response.jsonPath();
        var data = jsonPath.getObject("$", DataResponse.class);
        System.out.println(data.getAlbums().length);
        System.out.println(data.getArtists().length);
        System.out.println(data.isUseYouTube());
        System.out.println(data.getRecentlyPlayed());
        for (int i=0; i<data.getAlbums().length; i++){
            System.out.println(data.getAlbums()[i].getName());
        }
        Assert.assertEquals(data.getCurrentUser().getId(), 9);
        Assert.assertTrue(data.getInteractions().length>0);
    }

    @Test
    public void getAllPlaylists(){
        var response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("Authorization", "Bearer" + token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        var jsonPath = response.jsonPath();
        var playlists = jsonPath.getObject("$", PlaylistsResponse[].class);
        for (int i = 0; i< playlists.length;i++){
            System.out.println(playlists[i].getName());
        }
        List<Playlists> playlistsList = DbAdapter.getAllPlaylist(9);
        System.out.println(playlists.length + " " + playlistsList.size());
        Assert.assertTrue(playlists.length>0);
        Assert.assertEquals(playlists.length, playlistsList.size());

        List<Playlists> plFromDb = DbAdapter.getAllPlaylist(9);
        List<PlaylistsResponse> plFromApi = new ArrayList<>(Arrays.asList(playlists));

        Assert.assertEquals(plFromApi.size(), plFromDb.size());

        for (Playlists plDb:plFromDb){
            boolean indicator = false;
            for (PlaylistsResponse plApi:plFromApi){
                if(plApi.getId()==plDb.getId()){
                    Assert.assertEquals(plApi.getName(), plDb.getName());
                    indicator = true;
                }
            }
            Assert.assertTrue(indicator);
        }
    }
}
