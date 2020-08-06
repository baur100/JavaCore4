package hhPageObjectsHW;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HHMainPage extends HHBasePage {

    public HHMainPage(WebDriver driver) {
        super(driver);
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
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class = 'create']/*")));
    }

    public boolean isMain() {
        By playerControlButton = By.cssSelector("[href='#!/favorites']");
        wait.until(ExpectedConditions.elementToBeClickable(playerControlButton));
        var list = driver.findElements(playerControlButton);
        return list.size()==1;
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

    public String isPlaylistExist(String playlistId) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        By playlistIdBy = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        wait.until(ExpectedConditions.presenceOfElementLocated(playlistIdBy));
        var list = driver.findElement(playlistIdBy);
        js.executeScript("arguments[0].scrollIntoView();", list);
        return playlistId;
//        return true;
    }

    public boolean isLoginError() {
        By errorBy = By.cssSelector(".error");
        wait.until(ExpectedConditions.presenceOfElementLocated(errorBy));
        var list = driver.findElements(errorBy);
        return list.size()==1;
    }

    public boolean isPlaylistScrolledDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@href=\"#!/playlist/7002\"]")));
        WebElement Element = driver.findElement(By.xpath("//*[@href=\"#!/playlist/7002\"]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        return true;
    }
}
