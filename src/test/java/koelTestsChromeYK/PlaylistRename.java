package koelTestsChromeYK;

import pageObjectsYK.LoginP;
import pageObjectsYK.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistRename extends BaseTest {


    @Test
    public void playlistRename() {
        LoginP loginPage = new LoginP(driver);
        loginPage.openLoginPage();
        MainPage mainPage = loginPage.login("testpro.user04@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("X1X!");
        String name = mainPage.renamePlaylist(playlistId, "Y1Y");
        Assert.assertEquals("Y1Y", name);
    }
    @Test
    public void playlistRename2() {
        LoginP loginPage = new LoginP(driver);
        loginPage.openLoginPage();
        MainPage mainPage = loginPage.login("testpro.user04@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("W1W!");
        mainPage.renamePlaylist2(playlistId, "Z1Z");
        Assert.assertTrue(mainPage.playlistRenamed(playlistId));
    }
}
