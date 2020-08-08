package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getPlayerControl() {
        return fluentWait.until(x -> x.findElement(By.cssSelector("[href='#!/favorites']")));
    }
    private WebElement getScrollelement() {
        return this.driver.findElement(By.cssSelector("#sidebar > section.music > h1"));
    }
    private void clickOnPlusButton() {
        for (int i = 0; i < 50; i++) {
            try {
                driver.findElement(By.cssSelector(".fa.fa-plus-circle")).click();
                return;
            } catch (ElementClickInterceptedException | NoSuchElementException ignored) {

            }
        }
    }

    private WebElement getNewPlaylistNameField() {
        return this.driver.findElement(By.xpath("//*[@class = 'create']/*"));
    }

    public boolean isMain() {
        try {
            getPlayerControl().isDisplayed();
        } catch (TimeoutException xx) {
            return false;
        }
        return true;
    }

    public String createNewPlaylist(String playlistName) {
        clickOnPlusButton();
        getNewPlaylistNameField().sendKeys(playlistName);
        getNewPlaylistNameField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success.show")));
        String url = driver.getCurrentUrl();
        String[] parts = url.split("/");
        return parts[5];
    }

    public boolean isPlaylistExist(String playlistId) {
        for (int i = 0; i < 50; i++) {
            try {
                driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
                return true;
            } catch (NoSuchElementException ignored) {
            }
        }
        return false;
    }

    public boolean FindElementScrollingdown() {
        try {
            WebElement elementscroll = driver.findElement(By.cssSelector("#sidebar > section.music > ul > li:nth-child(1) > a"));
            wait.until(ExpectedConditions.visibilityOf(elementscroll));
            elementscroll.click();

           WebElement Bottomelement = driver.findElement(By.cssSelector("#playlists > ul > li:last-child> a"));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();",  Bottomelement);
            wait.until(ExpectedConditions.visibilityOf(Bottomelement));
            return Bottomelement.isDisplayed();
            // Scroll Down using Actions class

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}