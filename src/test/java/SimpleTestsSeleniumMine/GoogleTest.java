package SimpleTestsSeleniumMine;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
  private WebDriver driver;

    //    beforeMethod Annotation
    @BeforeMethod
    public void startUp(){
        //    Arrange -- Given
        //Windows users must use chromedriver.exe in this path and Mac users mus'nt use the .exe extension
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    //    Create the Test

    @Test
    public void findJavaInGoogle_AssertResult(){
    //    Arrange -- Given

    //    Act
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Assert.assertEquals(driver.getTitle(),"Java - Google Search");

    }


    @Test
    public void findSeleniumInGoogle_AssertResult(){
//        Arrange -- Given

//        Act
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);

        Assert.assertEquals(driver.getTitle(),"Selenium - Google Search");

    }



}
