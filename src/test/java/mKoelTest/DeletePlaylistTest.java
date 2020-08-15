package mKoelTest;

import mHardCodedObjects.mTestStringInputs;
import mHardCodedObjects.HtmlPathSelectors;
import mPageObject.LoginPage;
import mPageObject.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


import javax.swing.*;

public class DeletePlaylistTest extends BaseTest implements mTestStringInputs, HtmlPathSelectors{

    @Test
    public void deleteExistingPlaylist(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel(userName1,password);
        var playListPage = mainPage.clickFirstPlaylist();
        playListPage.isPlaylistPageDisplayed();
        playListPage.deletePlaylist();
        mainPage.isMain();
    }
}
