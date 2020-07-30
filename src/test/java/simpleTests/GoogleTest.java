package simpleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void findSeleniumInGoogle_AssertResult() throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        WebElement searchButton = driver.findElement(By.cssSelector("[name='btnK']"));

        searchField.sendKeys("Selenium");
        Thread.sleep(1000);
        searchButton.click();

        Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
    }

    @Test
    public void findJavaInGoogle_AssertResult() throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        WebElement searchButton = driver.findElement(By.cssSelector("[name='btnK']"));

        searchField.sendKeys("Java");
        Thread.sleep(1000);
        searchButton.click();

        Assert.assertEquals(driver.getTitle(), "Java - Google Search");
    }

    @Test
    public void findMavenInGoogle_AssertResult() throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        WebElement searchButton = driver.findElement(By.cssSelector("[name='btnK']"));

        searchField.sendKeys("Maven");
        Thread.sleep(1000);
        searchButton.click();

        Assert.assertEquals(driver.getTitle(), "Maven - Google Search");
    }

}
