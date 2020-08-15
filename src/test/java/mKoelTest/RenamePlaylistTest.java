package mKoelTest;

import mHardCodedObjects.mTestStringInputs;
import mPageObject.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RenamePlaylistTest extends BaseTest implements mTestStringInputs{

    @Parameters({"email","password"})
    @Test
    public void renamePlayList(){
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var mainPage = loginPage.loginToKoel(userName1, password);
        String playListID = mainPage.createNewPlaylist("xxxxTestPlayList");
        mainPage.renamePlayList(playListID,"xzyxxxyzTestPlayList");
    }

}

