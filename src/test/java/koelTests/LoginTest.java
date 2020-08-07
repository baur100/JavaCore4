package koelTests;


import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
<<<<<<< HEAD
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
=======
    public void startUp() throws NoSuchFieldException {
        driver = BrowserFabric.getDriver(BrowserType.FIREFOX);
>>>>>>> remotes/origin/master
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginToKoel() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        MainPage mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void createPlaylist() {
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("xxxTestPLAYllllliiist");
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test(enabled=false)
    public void playlist7003exist(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        mainPage.isMain();
        Assert.assertTrue(mainPage.isPlaylistExist("7003"));
    }
    @Test
    public void wrongLogin(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.loginToKoel("testpro.user04@testpro.io","wrongPassword");
        Assert.assertTrue(loginPage.isWrongLogin());
    }
    @Test
    public void loginToKoel1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        MainPage mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void createPlaylist1() {
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("xxxTestPLAYllllliiist");
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test(enabled=false)
    public void playlist7003exist1(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        mainPage.isMain();
        Assert.assertTrue(mainPage.isPlaylistExist("7003"));
    }
<<<<<<< HEAD

    @Test
    public void logInError(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        MainPage mainPage = loginPage.loginToKoel("**testpro.user04@testpro.io","te$t$tudent");
        Assert.assertTrue(loginPage.isError());
    }



=======
    @Test
    public void wrongLogin1(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.loginToKoel("testpro.user04@testpro.io","wrongPassword");
        Assert.assertTrue(loginPage.isWrongLogin());
    }
    @Test
    public void loginToKoel2() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        MainPage mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void createPlaylist2() {
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("xxxTestPLAYllllliiist");
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test
    public void wrongLogin2(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.loginToKoel("testpro.user04@testpro.io","wrongPassword");
        Assert.assertTrue(loginPage.isWrongLogin());
    }
>>>>>>> remotes/origin/master
}
