package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
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
                driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
                return true;
            } catch (NoSuchElementException ignored){     }
        }
        return false;
    }

    private WebElement getHome() {
        return this.driver.findElement(By.cssSelector("[class='home active']"));
    }

    public void sideNavScrollDown() throws InterruptedException {
        Thread.sleep(1000); //refactor later
        getHome().sendKeys(Keys.PAGE_DOWN);
    }
}
