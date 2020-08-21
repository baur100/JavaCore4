package koelTestsChromeYK;

import pageObjectsYK.LoginP;
import pageObjectsYK.MainPage;
import org.testng.annotations.Test;

public class ScrollPage extends BaseTest{

    @Test
    public void scrollToLastPlaylist () {
        LoginP loginPage = new LoginP(driver);
        loginPage.openLoginPage();
        MainPage mainPage = loginPage.login("testpro.user18@testpro.io", "te$t$tudent");
        mainPage.scrollDownPlaylists();
    }

    @Test
    public void scrollToTopAlbums (){
        LoginP loginPage = new LoginP(driver);
        loginPage.openLoginPage();
        MainPage mainPage = loginPage.login("testpro.user18@testpro.io", "te$t$tudent");
        mainPage.scrollToTopAlbums();
    }

}
