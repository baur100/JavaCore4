package mPageObject;

import mHardCodedObjects.HtmlPathSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllSongsPage extends BasePage implements HtmlPathSelectors {

    public AllSongsPage(WebDriver driver){
        super(driver);
    }

    public void isAllSongsPgDisplayed(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(allSongsPgCSSPath)));
        WebElement cssPathAllSongsPg = driver.findElement(By.cssSelector("section#songsWrapper"));
        cssPathAllSongsPg.isDisplayed();
    }

    public void clickAllBtnAllSongsPg(){
        WebElement cssPathAllBtnAllSongsPg = driver.findElement(By.cssSelector("section#songsWrapper button.btn.btn-orange.btn-shuffle-all"));
        cssPathAllBtnAllSongsPg.isDisplayed();
        cssPathAllBtnAllSongsPg.click();
    }

    public void clickAddToBtnAllSongsPg(){
        WebElement cssPathAddToBtnAllSongsPg = driver.findElement(By.cssSelector("button.btn.btn-green.btn-add-to"));
        cssPathAddToBtnAllSongsPg.isDisplayed();
        cssPathAddToBtnAllSongsPg.click();
    }

    public void clickClearButton(){
        WebElement clrBtn = this.driver.findElement(By.cssSelector("button.btn.btn-red.btn-clear-queue"));
        clrBtn.isDisplayed();
        clrBtn.click();
    }

}
