package L9PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public Basic(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
    }
}
