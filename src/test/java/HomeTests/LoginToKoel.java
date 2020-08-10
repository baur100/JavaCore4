package HomeTests;

import L9HWPageObjects.LoginP;
import L9HWPageObjects.MainPage;
import enumsYK.BrowserToChoose;
import helpersYK.BrowserFabrics;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToKoel {
    private WebDriver driver;


    @BeforeMethod
    public void startUp () throws NoSuchFieldException {
        driver = BrowserFabrics.getDriver(BrowserToChoose.CHROME);
    }
    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

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
        loginPage.login("testpro.user04@testpro.io", "te$t$tudent");
        Assert.assertTrue(loginPage.redPhramePresents());
    }
}
