package koelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class MainTest {
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
    public void scrollPlaylist() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        MainPage mainPage = loginPage.loginToKoel("testpro.user04@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
        mainPage.playlistScroll();


    }
}

