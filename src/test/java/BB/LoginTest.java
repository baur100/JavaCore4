package BB;

import BBPageObjects.LoginPage;
import BBPageObjects.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

public class LoginTest {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    // Methods that will execute before each @Test
    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://order.bareburger.com/");
        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        // Web elements Xpath for opening login window
        By loginBy = By.xpath("//*[@alt=\"bareburger Icon\"]");
        By enterEmailBy = By.xpath("//*[@placeholder=\"Enter Email Here\"]");

        // Opening the login window by clicking on Login button
        var loginButton = driver.findElement(loginBy);
        loginButton.click();

        // Waiting to verify email field before entering credentials
        fluentWait.until(x->x.findElement(enterEmailBy).isDisplayed());
    }

    // Methods that will execute after each @Test
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    // Test to verify successful login with correct credentials
    @Test
    public void LoginTest_CorrectCredentials_LoggedToBareburger() {

        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToBareburger("thirsteacafe+test@gmail.com", "Lunchbox123");
        Assert.assertTrue(mainPage.isMain());
    }

    // Test to verify unsuccessful login with wrong password
    @Test
    public void LoginTest_WrongPassword_LoggedToBareburger() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToBareburger("thirsteacafe+test@gmail.com", "123456");
        Assert.assertTrue(loginPage.isError());
    }
}
