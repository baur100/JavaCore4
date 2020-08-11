package L9HWPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class MainPage extends Basic {
    public MainPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getSearchField() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='search']")));
        return this.driver.findElement(By.cssSelector("[type='search']"));
    }

    public WebElement getNewPlaylistField () {
        return this.driver.findElement(By.xpath("//*[@class = 'create']/*"));
    }

    public WebElement getDeleteButton (){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Delete this playlist']")));
        return this.driver.findElement(By.xpath("//*[@title='Delete this playlist']"));
    }

    public boolean isMain() {
        try {
            getSearchField().isDisplayed();
        } catch (TimeoutException error) {
            return false;
        }
        return true;
    }

    public void clickOnPlusButton() {
        for (int i = 0; i < 50; i++) {
            try {
                this.driver.findElement(By.cssSelector(".fa.fa-plus-circle.control.create")).click();
                return;
            } catch (ElementClickInterceptedException | NoSuchElementException ignored) {

            }
        }
    }

    public String createNewPlaylist (String playlistName){
        clickOnPlusButton();
        getNewPlaylistField().sendKeys(playlistName);
        getNewPlaylistField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success.show")));
        String url = driver.getCurrentUrl();
        String [] splitUrl = url.split("/");
        String playlistId = splitUrl[5];
        WebElement newPlaylist = this.driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newPlaylist);
        return playlistId;
    }

    public boolean playlistExists (String playlistId){
        try {
            driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
            return true;
        }
        catch (NoSuchElementException error){
            return false;
        }
    }

    public String deleteCreatedPlaylist (String playlistName){
        clickOnPlusButton();
        getNewPlaylistField().sendKeys(playlistName);
        getNewPlaylistField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success.show")));
        String url = driver.getCurrentUrl();
        String [] splitUrl = url.split("/");
        String playlistId = splitUrl[5];
        getDeleteButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success.show")));
        return playlistId;
    }

    public boolean playlistDeleted (String playlistId){
        try {
            wait.until((ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"))));
            driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
            return false;
        }
        catch (NoSuchElementException vv){
            return true;
        }
    }

    public void scrollDownPlaylists() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#!/playlist/3634']")));
        WebElement newPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/3634']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newPlaylist);
    }

    public void scrollToTopAlbums(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='top-albums as-thumbnails']/h1")));
        WebElement albumSection = driver.findElement(By.xpath("//*[@class='top-albums as-thumbnails']/h1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", albumSection);
    }





//    public WebElement getPlusButton() {
//        for (int i = 0; i < 50; i++) {
//            try {
//                this.driver.findElement(By.cssSelector(".fa.fa-plus-circle"));
//            } catch (ElementClickInterceptedException | NoSuchElementException ignored) {
//
//            }
//        }
//        return this.driver.findElement(By.cssSelector(".fa.fa-plus-circle"));
//    }

//    public void clickOnPlaylistField(){
//        for (int i = 0; i <50; i++){
//            try {
//                this.driver.findElement(By.xpath("//*[@class='create']/*")).click();
//                return;
//            } catch (TimeoutException | NoSuchElementException ignored){
//
//            }
//        }
//    }
}

