package koelTests;


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
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginToKoel() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        MainPage mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
        mainPage.sideNavScrollDown();
    }
    @Test
    public void createPlaylist(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        String playlistId = mainPage.createNewPlaylist("TestPLAYllllliiist");
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test
    public void playlist7003exist() throws InterruptedException {
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel("testpro.user04@testpro.io","te$t$tudent");
        mainPage.isMain();
        Assert.assertTrue(mainPage.isPlaylistExist("7003"));
    }
    @Test
    public void failedLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.loginToKoel("testpro.user04@testpro.io", "wrongpassword");
        Assert.assertTrue(loginPage.isError());
    }
}
