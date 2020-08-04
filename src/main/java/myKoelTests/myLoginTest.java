package myKoelTests;

import MyPageObjects.MyLoginPage;
import MyPageObjects.myMainPage;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.NoSuchElementException;

public class myLoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
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
        MyLoginPage MyLoginPage = new MyLoginPage(driver);
        MyLoginPage.openPage();
        myMainPage myMainPage = MyLoginPage.loginToKoel("testpro.user03@testpro.io", "11te$t$tudent");
        //Assert.assertTrue(myMainPage.isMain());
        Assert.assertTrue(myMainPage.isError());
    }

}
