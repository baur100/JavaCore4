package mKoelTest;

import mHardCodedObjects.DataProviderClass;
import mHardCodedObjects.mTestStringInputs;
import org.testng.annotations.Test;
import mPageObject.LoginPage;

public class AlbumTest extends BaseTest implements mTestStringInputs {

        @Test(dataProvider = "validLogin_isMain", dataProviderClass= DataProviderClass.class)
        public void album_playlistTest_loginToKoel(String assert_Check_Type, String userName, String password){
            var loginPage = new LoginPage(driver);
            loginPage.actionloginAndAssert(assert_Check_Type, userName, password);
        }

        @Test(dataProvider = "validLogin_createPlaylist", dataProviderClass= DataProviderClass.class)
        public void album_playlistTest_createPlaylist(String assert_Check_Type, String userName, String password) {
            var loginPage = new LoginPage(driver);
            loginPage.actionloginAndAssert(assert_Check_Type, userName, password);
        }

        @Test(dataProvider = "validLogin_playlist7003exist", dataProviderClass = DataProviderClass.class)
        public void album_playlistTest_playlist7003exist(String assert_Check_Type, String userName, String password) {
            var loginPage = new LoginPage(driver);
            loginPage.actionloginAndAssert(assert_Check_Type, userName, password);
        }

        @Test(dataProvider = "inValidLogin_wrongLogin", dataProviderClass = DataProviderClass.class)
        public void album_playlistTest_wrongLogin(String assert_Check_Type, String userName, String password){
            var loginPage = new LoginPage(driver);
            loginPage.actionloginAndAssert(assert_Check_Type, userName, password);
        }

}
