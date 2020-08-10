package MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class HomePageTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void createNewPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel
                ("testpro.user04@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("SinPlaylist");
        Assert.assertTrue(mainPage.isMain());
    }

    @Test
    public void scrollPlaylist() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel
                ("testpro.user04@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("SinPlaylist");
        boolean sinPlaylistExist = mainPage.isPlaylistExist("SinPlaylist");
        Assert.assertTrue(mainPage.isMain());

    }

    @Test
    public void renameNewPlaylist() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel
                ("testpro.user04@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("SinPlaylist");
        boolean sinPlaylistExist = mainPage.isPlaylistExist("SinPlaylist");
        mainPage.renamePlaylist(playlistId, "101");


    }
}

