package mKoelTest;

import mPageObject.LoginPage;
import org.testng.annotations.Test;

public class AllSongsTest extends BaseTest{

    @Test
    public void clickAllSongsLink(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel(userName1,password);
        mainPage.isMain();
        var allSongsPage = mainPage.clickAllSongsButton();
        allSongsPage.isAllSongsPgDisplayed();
        allSongsPage.clickAllBtnAllSongsPg();
        allSongsPage.clickClearButton();
        mainPage.clickHome();
    }

}
