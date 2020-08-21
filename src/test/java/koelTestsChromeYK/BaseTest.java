package koelTestsChromeYK;

import enumsYK.BrowserToChoose;
import helpersYK.BrowserFabrics;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;


    @BeforeMethod
    public void startUp () throws NoSuchFieldException {
        driver = BrowserFabrics.getDriver(BrowserToChoose.CHROME);
    }
    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
