package myKoelTests;

import MyPageObjects.MyLoginPage;
import MyPageObjects.myMainPage;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.NoSuchElementException;

public class myLoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
     //   driver = BrowserFabric.getDriver(BrowserType.FIREFOX);
//        driver = BrowserFabric.getDriver(BrowserType.EDGE);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginToKoel(){
        var MyLoginPage = new MyLoginPage(driver);
        MyLoginPage.openPage();
        var myMainPage = MyLoginPage.loginToKoel("testpro.user03@testpro.io", "te$t$tudent");
        Assert.assertTrue(myMainPage.isMain());
//        Assert.assertTrue(myMainPage.isError());
    }
    @Test
    public void createPlayList() {
        var MyLoginPage = new MyLoginPage(driver);
        MyLoginPage.openPage();
        var myMainPage = MyLoginPage.loginToKoel("testpro.user03@testpro.io", "te$t$tudent");
        String playlistId = myMainPage.createNewPlaylist("TestPlayListtt");
        Assert.assertTrue(myMainPage.isPlaylistExist(playlistId));
    }
    @Test
    public void playList7003exist() {
        var MyLoginPage = new MyLoginPage(driver);
        MyLoginPage.openPage();
        var myMainPage = MyLoginPage.loginToKoel("testpro.user03@testpro.io", "te$t$tudent");
        myMainPage.isMain();
//        Thread.sleep(5000);
        Assert.assertTrue(myMainPage.isPlaylistExist("7003"));

    }
    @Test
    public void wrongLogin(){
        var MyLoginPage = new MyLoginPage(driver);
        MyLoginPage.openPage();
        MyLoginPage.loginToKoel("testpro.user04@testpro.io","wrongPassword");
        Assert.assertTrue(MyLoginPage.isWrongLogin());
    }

    @Test
    public void pageScroll(){
        var MyLoginPage = new MyLoginPage(driver);
        MyLoginPage.openPage();
        var myMainPage = MyLoginPage.loginToKoel("testpro.user03@testpro.io", "te$t$tudent");
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Assert.assertTrue(myMainPage.scroll());
    }


}
