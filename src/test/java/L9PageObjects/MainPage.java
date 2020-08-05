package L9PageObjects;

import org.openqa.selenium.By;
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
}
