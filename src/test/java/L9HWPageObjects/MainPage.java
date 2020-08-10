package L9HWPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class MainPage extends Basic {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField () {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='search']")));
        return this.driver.findElement(By.cssSelector("[type='search']"));
    }

    public boolean isMain () {
        try {
            getSearchField().isDisplayed();
        }
        catch (TimeoutException error){
            return false;
        }
        return true;
    }

    public void scrollDown () throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)", "");
        Thread.sleep(2000);
    }
}

