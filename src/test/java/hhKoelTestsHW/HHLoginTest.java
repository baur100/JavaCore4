package hhKoelTestsHW;

import hhPageObjectsHW.HHLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HHLoginTest extends HHBaseTest {

    @Test
    public void loginToKoel_correctCredentials_successfullyLogin() {
        var loginPage = new HHLoginPage(driver);
        loginPage.openPage();
        var hhMainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        Assert.assertTrue(hhMainPage.isMain());
    }
    @Test
    public void loginToKoel_invalidEmail_loginError() {
        var loginPage = new HHLoginPage(driver);
        loginPage.openPage();
        var hhMainPage = loginPage.loginToKoel("testpro.user04@testpro", "te$t$tudent");
        Assert.assertTrue(hhMainPage.isLoginError());
    }
    @Test
    public void loginToKoel_wrongPassword_loginError() {
        var loginPage = new HHLoginPage(driver);
        loginPage.openPage();
        var hhMainPage = loginPage.loginToKoel("testpro.user04@testpro.io", "xxxxxxxxxxx");
        Assert.assertTrue(hhMainPage.isLoginError());
    }
    @Test
    public void createPlaylist(){
        var loginPage = new HHLoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        String playlistUrlId = mainPage.createNewPlaylist("TestPLAYllllliiist");
//        Assert.assertTrue(mainPage.isPlaylistExist(playlistUrlId));
        Assert.assertSame(mainPage.isPlaylistExist(playlistUrlId), playlistUrlId);
    }
    @Test
    public void playlist7003exist() throws InterruptedException {
        var loginPage = new HHLoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        mainPage.isMain();
//        Assert.assertTrue(mainPage.isPlaylistExist("7003"));
    }
    @Test
    public void playlistScrollDown_scrollAllTheWayDown_seeNewlyCreatedPlaylist() {
        var loginPage = new HHLoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        mainPage.isMain();
        Assert.assertTrue(mainPage.isPlaylistScrolledDown());
    }
}
