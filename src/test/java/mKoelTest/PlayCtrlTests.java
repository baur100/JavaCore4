package mKoelTest;

import mPageObject.LoginPage;
import mPageObject.PlayerCtrlPage;
import org.testng.annotations.Test;

public class PlayCtrlTests extends BaseTest{

    @Test
    public void playAndPauseSongs(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel(userName1,password);
        mainPage.isMain();
        var playerCtrlPage = new PlayerCtrlPage(driver);

        playerCtrlPage.playerControlPlayBtn();
        playerCtrlPage.playerCtrlMute();
        playerCtrlPage.playerCtrlUnMute();
        playerCtrlPage.playerControlPauseBtn();
        playerCtrlPage.playerControlNextBtn();
        playerCtrlPage.playerControlPrevBtn();
        playerCtrlPage.playerControlPauseBtn();
    }
}
