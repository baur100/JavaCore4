package L9HWPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        return getSearchField().isDisplayed();
    }

    public void scrollDown () throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)", "");
        Thread.sleep(2000);
    }
}

