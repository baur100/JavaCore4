package mySimpleTests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class MyKoelLogin {
    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, 20);
        fluentWait = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(20))
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);

        driver.get("https://koelapp.testpro.io");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void findSeleniumInGoogle_AssertResult(){
        //Thread.sleep(2000);
        //webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type='email']")));
        //fluentWait.until(x->x.findElement(By.cssSelector("[type='email']")).isDisplayed());

        WebElement emailField = null;
        boolean xx = true;
        double maxTime = 0;

        while(xx){
            try {
                emailField = driver.findElement(By.cssSelector("[type='email']"));
                xx = false;
            } catch (NoSuchElementException ex) {
                try {
                    Thread.sleep(200);
                    maxTime +=0.2;
                    if(maxTime >=20.0){
                        throw new NoSuchElementException("Element not found");
                    }
                } catch (InterruptedException ee){
            }
        }
        }

        //WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("[type=submit]"));

        emailField.sendKeys("testpro.user03@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();
        //Thread.sleep(2000);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("playerControls")));
        WebElement playerControl = driver.findElement(By.id("playerControls"));
        Assert.assertTrue(playerControl.isDisplayed());

    }
}



