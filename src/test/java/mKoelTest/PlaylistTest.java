/*
package mKoelTest;

import listeners.RetryAnalyzer;
import mHardCodedObjects.DataProviderClass;
import mHardCodedObjects.mTestStringInputs;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import mPageObject.LoginPage;


public class PlaylistTest  extends BaseTest implements mTestStringInputs {

    private static Logger logger = LogManager.getLogger(PlaylistTest.class);


    @Test(dataProvider = "validLogin_isMain", dataProviderClass= DataProviderClass.class)
    public void playlistTest_loginToKoel(String assert_Check_Type, String userName, String password) {
        var loginPage = new LoginPage(driver);
        loginPage.action_loginAndAssert(assert_Check_Type, userName, password);
    }

    @Test(dataProvider = "validLogin_createPlaylist", dataProviderClass= DataProviderClass.class)
    public void playlistTest_createPlaylist(String assert_Check_Type, String userName, String password) {
        var loginPage = new LoginPage(driver);
        loginPage.action_loginAndAssert(assert_Check_Type, userName, password);
    }

    @Test
(enabled=true, retryAnalyzer = RetryAnalyzer.class )
(dataProvider = "validLogin_playlist7003exist", dataProviderClass = DataProviderClass.class)
    public void playlistTest_playlist7003exist(String assert_Check_Type, String userName, String password) {
        var loginPage = new LoginPage(driver);
        loginPage.action_loginAndAssert(assert_Check_Type, userName, password);
    }

    @Test(dataProvider = "inValidLogin_wrongLogin", dataProviderClass = DataProviderClass.class)
    public void playlistTest_wrongLogin(String assert_Check_Type, String userName, String password){
        var loginPage = new LoginPage(driver);
        loginPage.action_loginAndAssert(assert_Check_Type, userName, password);
    }

}
*/
