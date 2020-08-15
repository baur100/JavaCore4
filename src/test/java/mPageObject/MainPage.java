package mPageObject;

import mHardCodedObjects.HtmlPathSelectors;
import mHardCodedObjects.mTestStringInputs;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage implements HtmlPathSelectors, mTestStringInputs {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getPlayerControl() {
        return fluentWait.until(x -> x.findElement(By.cssSelector(favouritesCssPath)));
    }

    private void clickOnPlusButton() {

        for (int i = 0; i < 50; i++) {
            try {
//                driver.findElement(By.cssSelector(newPlaylistCircleCssPath)).click();
//                driver.findElement(By.xpath(createNewPlayListXPath)).click();
                System.out.println("\n\nwill wait\n\n");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(createPlayListCircleCssPath)));
                System.out.println("\n\nwaited\n\n");
                driver.findElement(By.cssSelector(createPlayListCircleCssPath)).click();
                System.out.println("\n\nclicked\n");
                return;
            } catch (ElementClickInterceptedException | NoSuchElementException ignored) {
                System.out.println("CLICK ON PLUS BUTTON - Other 2 exceptions catched");
                ignored.printStackTrace();
            }
           catch (NullPointerException npe){
               System.out.println("CLICK ON PLUS BUTTON - Null Pointer Exception Catched");
               npe.printStackTrace();
           }
        }
    }

    private WebElement getNewPlaylistNameField() {
//        return this.driver.findElement(By.cssSelector(emptyPlayListNamingFieldCssPath));
        return this.driver.findElement(By.xpath(createNewPlayListXPath));
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

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(playListCreationSuccessCssPath)));

        String url = driver.getCurrentUrl();
        String[] parts = url.split("/");
        String playListId = parts[5];

        WebElement newPlayListCreated = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playListId+"']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",newPlayListCreated);

        /*
        //   Not working
        //   Actions action = new Actions(driver);
        //   action.sendKeys(Keys.PAGE_DOWN).build().perform();
        */
        /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        */
        /*
        WebElement newPlaylistCreatedNow = driver.findElement(By.cssSelector(playlistNamefromListCSSPath+playListId+"']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView",newPlaylistCreatedNow);
        */

        return parts[5];
        //return "";
    }

    public boolean isPlaylistExist(String playlistId) {
        int count= 0;
        String url = driver.getCurrentUrl();
        System.out.println("\n\nURL: \n"+url+"\n\n");

        for (int i = 0; i < 50; i++) {
            try {
                driver.findElement(By.cssSelector(playlistNameListCSSPath +playlistId+"']"));
/*                driver.findElement(By.xpath(playListNamePart1XPath +playlistId+"']"));*/
                System.out.println("True - playList ID = "+playlistId);
                return true;
            } catch (NoSuchElementException ignored){
                System.out.println("\n\nCount: "+count+"\nPlayListID No such element found "+playlistId);
                ignored.printStackTrace();
            }
            count +=i;
        }
        System.out.println("iteration count: "+count+"\nFalse - playList ID = "+playlistId);
        return false;
    }

    public PlaylistPage clickFirstPlaylist(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*=\"playlist\"]")));
        WebElement firstPlaylist = this.driver.findElement(By.cssSelector("a[href*=\"playlist\"]"));
        firstPlaylist.click();
        return new PlaylistPage(driver);
    }

    public FavoritesPage clickFavoritesButton(){
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(favouritesCssPath)));
//        cssPathFavourites.click();
        WebElement favPgBtn = this.driver.findElement(By.cssSelector(favouritesCssPath));
//        WebElement favPgBtn = this.driver.findElement(By.xpath(playerFavoritesXPath));
        favPgBtn.isDisplayed();
        favPgBtn.click();
        return new FavoritesPage(driver);
    }

    public AllSongsPage clickAllSongsButton(){
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(allSongsLinkCSSPath)));
        WebElement cssPathAllSongsLink = driver.findElement(By.cssSelector("[href='#!/songs']"));
        cssPathAllSongsLink.isDisplayed();
        cssPathAllSongsLink.click();
        return new AllSongsPage(driver);
    }

    public void clickHome(){
//        cssPathHome.click();
        WebElement homeBtn = this.driver.findElement(By.cssSelector("[href='#!/home']"));
        homeBtn.isDisplayed();
        homeBtn.click();
    }

    public void renamePlayList(String playlistId,String newPlayListnameXX ){
        var playList = driver.findElement(By.xpath(playListNamePart1XPath +playlistId+"']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(playList).perform();
        var editField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        editField.sendKeys(Keys.CONTROL+"a");
        editField.sendKeys(newNameForRename);
        editField.sendKeys(Keys.RETURN);
    }

}

