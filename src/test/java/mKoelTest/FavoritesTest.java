package mKoelTest;

import mHardCodedObjects.mTestStringInputs;
import mPageObject.LoginPage;
import org.testng.annotations.Test;

public class FavoritesTest extends BaseTest implements mTestStringInputs {

    @Test
    public void checkFavouritesPage(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel(userName1,password);
        mainPage.isMain();
        var favoritePage = mainPage.clickFavoritesButton();
        favoritePage.clickAllButton();
        favoritePage.clickClearButton();
        mainPage.clickHome();
    }

}
