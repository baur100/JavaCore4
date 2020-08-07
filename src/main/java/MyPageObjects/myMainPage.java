package MyPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class myMainPage extends myBasePage {

    public myMainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getPlayerControl() {
        return fluentWait.until(x -> x.findElement(By.cssSelector("[href='#!/favorites']")));
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
        return this.driver.findElement(By.xpath("//*[@class='create']"));
    }

    //    private WebElement invalidLogin() {
//        return fluentWait.until(x -> x.findElement(By.cssSelector("[class='error']")));
//    }
    public boolean isMain() {
        try {
            getPlayerControl().isDisplayed();
        } catch (TimeoutException xx) {
            return false;
        }
        return true;
    }


    //    public boolean isError() {
//        try {
//            invalidLogin().isDisplayed();
//        } catch (TimeoutException xx) {
//            return false;
//        }
//        return true;
//    }
    public String createNewPlaylist(String playlistName) {
        clickOnPlusButton();
        getNewPlaylistNameField().sendKeys(playlistName);
        getNewPlaylistNameField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success.show")));
        String url = driver.getCurrentUrl();
        String[] parts = url.split("/");
//                System.out.println(parts[5]);
        return parts[5];

    }

    public boolean isPlaylistExist(String playListId) {
        for (int i = 0; i < 50; i++) {
            try {
                driver.findElements(By.xpath("//*[@href='#!/playlist/" + playListId + "']"));
                return true;
            } catch (NoSuchElementException ignored) {
            }
        }
        return false;
    }

    private WebElement getLastPlayList() {
        return fluentWait.until(x -> x.findElement(By.xpath("//*[@href='#!/playlist/6950']")));
    }

    public boolean scroll() {
        try {
            getLastPlayList().isDisplayed();
        } catch (TimeoutException xx) {
            return false;
        }
        return true;
    }
}











