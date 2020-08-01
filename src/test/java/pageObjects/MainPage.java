package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPlayerControl(){
        return fluentWait.until(x->x.findElement(By.id("playerControls")));
    }

    public boolean isMain() {
        try {
            getPlayerControl().isDisplayed();
        } catch (TimeoutException xx) {
            return false;
        }
        return true;
    }
}
