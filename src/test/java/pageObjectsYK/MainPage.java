package pageObjectsYK;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'create']/*")));
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

    public String renamePlaylist (String playlistId, String newPlName){
        Actions actions = new Actions(driver);
        WebElement playlistCreated = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        actions.doubleClick(playlistCreated).perform();
        WebElement editField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        editField.sendKeys(Keys.CONTROL +"a");
        editField.sendKeys(newPlName);
        editField.sendKeys(Keys.ENTER);
        String name = playlistCreated.getText();
        return name;
    }

    //*[@href='#!/playlist/7384']/text()

    public void renamePlaylist2 (String playlistId, String newPlName){
        Actions actions = new Actions(driver);
        WebElement playlistCreated = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        actions.doubleClick(playlistCreated).perform();
        WebElement editField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        editField.sendKeys(Keys.CONTROL +"a");
        editField.sendKeys(newPlName);
        editField.sendKeys(Keys.ENTER);
    }

    public boolean playlistRenamed (String playlistId){
//        Actions actions = new Actions(driver);
        wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"))));
        WebElement playlistRenamed = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
//        actions.doubleClick(playlistRenamed).perform();
//        String name = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input")).getText();
        String name = playlistRenamed.getText();
        if (name == "Z1Z") {
            return true;
        } else {
            return false;
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

