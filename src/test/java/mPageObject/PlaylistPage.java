package mPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlaylistPage extends BasePage{

    public PlaylistPage(WebDriver driver) {
        super(driver);
    }

    public void isPlaylistPageDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("section#playlistWrapper h1.heading")));
        WebElement playlistSection = this.driver.findElement(By.cssSelector("section#playlistWrapper h1.heading"));
        playlistSection.isDisplayed();
    }

    public void deletePlaylist(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.del.btn.btn-red.btn-delete-playlist")));
        WebElement deleteButton = this.driver.findElement(By.cssSelector("button.del.btn.btn-red.btn-delete-playlist"));
        deleteButton.isDisplayed();
        deleteButton.click();
    }



}
