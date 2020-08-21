package koelTestsChromeYK;

import pageObjectsYK.LoginP;
import pageObjectsYK.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistCreate extends BaseTest {

    @Test
    public void createPlaylist() {
        LoginP loginPage = new LoginP(driver);
        loginPage.openLoginPage();
        MainPage mainPage = loginPage.login("testpro.user04@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("WWWWWWW");
        Assert.assertTrue(mainPage.playlistExists(playlistId));
    }

    @Test
    public void deletePlaylist () {
        LoginP loginPage = new LoginP(driver);
        loginPage.openLoginPage();
        MainPage mainPage = loginPage.login("testpro.user04@testpro.io", "te$t$tudent");
        String playlistId = mainPage.deleteCreatedPlaylist("YYY");
        Assert.assertTrue(mainPage.playlistDeleted(playlistId));
    }
}
