package lesson5Simple;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





public class Google {
    private WebDriver driver;


    @BeforeMethod
    //Before each test run
    public void startUp(){
        // Arrangement
        System.setProperty("webdriver.chrome.driver", "chromeDriver");
        driver = new ChromeDriver();
        driver.get("https://google.com");


    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();

    }
    @Test
    public void findSeleniumInGoogle_AssertResult() throws InterruptedException {
        //Act
        WebElement searchField = driver.findElement(By.cssSelector("[q='name']"));
        WebElement searchButton = driver.findElement(By.cssSelector("[name='btnk']"));

        searchField.sendKeys ("Selenium");
        searchButton.click();

        Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");

    }


}
