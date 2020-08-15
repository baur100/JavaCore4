package mHardCodedObjects;

import org.testng.annotations.DataProvider;

public class DataProviderClass implements mTestStringInputs{

    @DataProvider(name="validLogin_isMain")
    public Object[][] validLoginInputs_isMain(){
        return new Object[][]{
                {isMain,userName1,password},
                {isMain,userName2,password},
                {isMain,userName3,password}
        };
    }

    @DataProvider(name = "validLogin_createPlaylist")
    public Object[][] validLoginInputs_createPlaylist(){
        return new Object[][]{
                {isPlaylistExist,userName1,password},
                {isPlaylistExist,userName2,password},
                {isPlaylistExist,userName3,password}
        };
    }

    @DataProvider(name = "validLogin_playlist7003exist")
    public Object[][] validLoginInputs_playlist7003exist(){
        return new Object[][]{
                {playlist7003exist,userName1,password},
               /* {playlist7003exist,userName2,password},
                {playlist7003exist,userName3,password}*/
        };
    }

    @DataProvider(name="inValidLogin_wrongLogin")
    public Object[][] inValidLoginInputs(){
        return new Object[][]{
                {wrongLogin,wrong_UserName1,wrong_Password1},
                {wrongLogin,wrong_UserName2,wrong_Password2},
                {wrongLogin,wrong_UserName3,wrong_Password3}
        };
    }


}
