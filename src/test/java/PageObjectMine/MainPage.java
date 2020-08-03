package PageObjectMine;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selectorsMine.HtmlSelectors;

public class MainPage extends BasePage implements HtmlSelectors {

    public boolean isMain(){
        try{
            getPlayerControl().isDisplayed();
        }catch (TimeoutException xx){
            return false;
        }
        return true;
    }

    public String createNewPlaylist(String playListName){
        clickOnPlusButton();
        getNewPalyListNameField().sendKeys(playListName);
        getNewPalyListNameField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success.show")));
        System.out.println(driver.getCurrentUrl());
        String url = driver.getCurrentUrl();
        String[] parts = url.split("/");
        System.out.println(parts[5]);
        return parts[5];
    }

    public boolean isPlayListExist(int playListId){
        for(int i = 0; i <50; i++){
            try{
                driver.findElement(By.xpath(playListNameSelector+playListId+"']"));
                return true;
            }catch (NoSuchElementException ignored){    }
        }
        return false;
    }

//    HomeWork
    public void scrollPage(){

    }
    public MainPage(WebDriver driver) {
        super(driver);
    }

}
