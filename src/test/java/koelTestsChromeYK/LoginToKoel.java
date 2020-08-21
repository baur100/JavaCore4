package koelTestsChromeYK;

import pageObjectsYK.LoginP;
import pageObjectsYK.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToKoel extends BaseTest {


    @Test
    public void loginPass () {
        LoginP loginPage = new LoginP(driver);
        loginPage.openLoginPage();
        MainPage mainPage = loginPage.login("testpro.user04@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }

    @Test
    public void loginFail () {
        LoginP loginPage = new LoginP(driver);
        loginPage.openLoginPage();
        loginPage.login("testpro.user04@testpro.io", "te$t$tudent1");
        Assert.assertTrue(loginPage.redPhramePresents());
    }
}
