package mPageObject;

import mHardCodedObjects.HtmlPathSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FavoritesPage extends BasePage implements HtmlPathSelectors{

    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    public void clickAllButton(){
        WebElement alBtn = this.driver.findElement(By.cssSelector("section#favoritesWrapper>h1.heading>div.buttons.song-list-controls>button.btn.btn-orange.btn-shuffle-all"));
        alBtn.isDisplayed();
        alBtn.click();
    }

    public void clickClearButton(){
        WebElement clrBtn = this.driver.findElement(By.cssSelector("button.btn.btn-red.btn-clear-queue"));
        clrBtn.isDisplayed();
        clrBtn.click();
    }

}
