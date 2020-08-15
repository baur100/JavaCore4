package mKoelTest;

import mHardCodedObjects.DataProviderClass;
import mHardCodedObjects.mTestStringInputs;
import org.testng.annotations.Test;
import mPageObject.LoginPage;

public class LoginTest  extends BaseTest implements mTestStringInputs{

    @Test(dataProvider = "validLogin_isMain", dataProviderClass= DataProviderClass.class)
    public void loginToKoel(String assert_Check_Type, String userName, String password) {
        var loginPage = new LoginPage(driver);
        loginPage.action_loginAndAssert(assert_Check_Type, userName, password);
    }

    @Test(dataProvider = "validLogin_createPlaylist", dataProviderClass= DataProviderClass.class)
    public void createPlaylist(String assert_Check_Type, String userName, String password){
        var loginPage = new LoginPage(driver);
        loginPage.action_loginAndAssert(assert_Check_Type, userName, password);
    }

    @Test(dataProvider = "validLogin_playlist7003exist", dataProviderClass = DataProviderClass.class)
    public void playlist7003exist(String assert_Check_Type, String userName, String password) {
        var loginPage = new LoginPage(driver);
        loginPage.action_loginAndAssert(assert_Check_Type, userName, password);
    }

    @Test(dataProvider = "inValidLogin_wrongLogin", dataProviderClass = DataProviderClass.class)
    public void wrongLogin_isMain(String assert_Check_Type, String userName, String password){
        var loginPage = new LoginPage(driver);
        loginPage.action_loginAndAssert(assert_Check_Type, userName, password);
    }

}



