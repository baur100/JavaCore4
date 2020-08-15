package mKoelTest;

import enums.BrowserType;
import helpers.BrowserFabric;
import helpers.GetScreenshot;
import mHardCodedObjects.mTestStringInputs;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements mTestStringInputs {
    protected WebDriver driver;

    @BeforeMethod
    public void startUp() throws NoSuchFieldException {
       /* System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        System.out.println("HELLO WORLD........"); */
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException /*throws InterruptedException*/ {
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            GetScreenshot.capture(driver,iTestResult.getName());
        }
        Thread.sleep(5000);
        driver.quit();
    }

}
