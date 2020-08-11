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

public class PlaylistCreate {
    private WebDriver driver;


    @BeforeMethod
    public void startUp() throws NoSuchFieldException {
        driver = BrowserFabrics.getDriver(BrowserToChoose.CHROME);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

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
