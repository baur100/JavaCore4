package mPageObject;

import mHardCodedObjects.HtmlPathSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

public class PlayerCtrlPage extends BasePage implements HtmlPathSelectors {

    public PlayerCtrlPage(WebDriver driver){
        super(driver);
    }

    public void playerControlPlayBtn(){
        WebElement cssPathPlayBtnPlayerCtrl = driver.findElement(By.cssSelector("span.play.control, i.fa.fa-play"));
        cssPathPlayBtnPlayerCtrl.isDisplayed();
        cssPathPlayBtnPlayerCtrl.click();
        cssPathPlayBtnPlayerCtrl.isDisplayed();
    }

    public void playerControlPauseBtn(){
        WebElement cssPathPauseBtnPlayerCtrl = driver.findElement(By.cssSelector("span.pause.control"));
        cssPathPauseBtnPlayerCtrl.isDisplayed();
        cssPathPauseBtnPlayerCtrl.click();
        cssPathPauseBtnPlayerCtrl.isDisplayed();
    }

    public void playerControlPrevBtn(){
        WebElement cssPathPrevBtnPlayerControl = driver.findElement(By.cssSelector("i.prev.fa.fa-step-backward.control"));
        cssPathPrevBtnPlayerControl.isDisplayed();
        cssPathPrevBtnPlayerControl.click();
        cssPathPrevBtnPlayerControl.isDisplayed();
    }

    public void playerControlNextBtn(){
        WebElement cssPathNextPlayerControl = driver.findElement(By.cssSelector("i.next.fa.fa-step-forward.control"));
        cssPathNextPlayerControl.isDisplayed();
        cssPathNextPlayerControl.click();
        cssPathNextPlayerControl.isDisplayed();
    }

    public void playerCtrlRepeat(){
        WebElement cssPathRepeatBtn = driver.findElement(By.cssSelector("i.fa.fa-repeat"));
        cssPathRepeatBtn.isDisplayed();
        cssPathRepeatBtn.click();
        cssPathRepeatBtn.isDisplayed();
    }

    public void playerCtrlMute(){
        WebElement cssPathMuteVolumePlayerCtrl = driver.findElement(By.cssSelector("i.fa.fa-volume-up.mute"));
        cssPathMuteVolumePlayerCtrl.isDisplayed();
        cssPathMuteVolumePlayerCtrl.click();
        WebElement cssPathUnMuteVolumePlayerCtrl = driver.findElement(By.cssSelector("i.fa.fa-volume-off.unmute"));
        cssPathUnMuteVolumePlayerCtrl.isDisplayed();
    }

    public void playerCtrlUnMute(){
        WebElement cssPathUnMuteVolumePlayerCtrl = driver.findElement(By.cssSelector("i.fa.fa-volume-off.unmute"));
        cssPathUnMuteVolumePlayerCtrl.isDisplayed();
        cssPathUnMuteVolumePlayerCtrl.click();
        WebElement cssPathMuteVolumePlayerCtrl = driver.findElement(By.cssSelector("i.fa.fa-volume-up.mute"));
        cssPathMuteVolumePlayerCtrl.isDisplayed();
    }

}
