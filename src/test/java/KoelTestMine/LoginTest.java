package KoelTestMine;

import PageObjectMine.LoginPg;
import PageObjectMine.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void loginToKoel(){
        LoginPg loginPg = new LoginPg(driver);
        loginPg.openPage();
        MainPage mainPage = loginPg.loginToKoel("busyteddy@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }

}
