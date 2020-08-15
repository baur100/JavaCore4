package mHardCodedObjects;


import org.openqa.selenium.chrome.ChromeDriver;


public interface HtmlPathSelectors {

    //  css Selector paths
    String loginEmailBoxCssPath = "[type='email']";
    String loginPasswordCssPath = "[type='password']";
    String loginButtonCssPath = "[type='submit']";
    String createPlayListCircleCssPath = "i.create";
    String newPlaylistCircleCssPath = ".fa.fa-playlist-circle";
    String createNewPlayListCircleCSSPath = "i.fa.fa-plus-circle.control.create";
    String createPlyLstCrclCSSPath = ".fa.fa-plus-circle";
    String createPlyLstCrclCSSPatwoDots = ".fa fa-plus-circle control create";

//    String emptyPlayListNamingFieldCssPath = "form.create input[type=text]";
    String favouritesCssPath = "a[href='#!/favorites']";
    String playListCreationSuccessCssPath = ".success.show";
    String playlistNameListCSSPath = "a[href='#!/playlist/";


    /*String homeCSSPath = "[href='#!/home']";*/
    String allBtnFavoritesPgCSSPath = "section#playlistWrapper button.btn.btn-orange.btn-shuffle-all";
    String clearBtnFavoritesPgCSSPath = "button.del.btn.btn-red.btn-delete-playlist";
    String checkClearBtnFunctionality = "section#queueWrapper";

    String playBtnPlayerCtrlCSSPath = "span.play.control i.fa.fa-play";
    String pauseBtnPlayerCtrlCSSPath = "span.pause.control";
    String prevBtnPlayerCtrlCSSPath = "i.prev.fa.fa-step-backward.control";
    String nextBtnPlayerCtrlCSSPath = "i.next.fa.fa-step-forward.control";
    String repeatBtnPlayerCtrlCSSPath = "i.fa.fa-repeat";
    String muteVolumePlayerCtrlCSSPath = "i.fa.fa-volume-up.mute";
    String unMuteVolumePlayerCtrlCSSPath = "i.fa.fa-volume-off.unmute";


    String allSongsLinkCSSPath = "[href='#!/songs']";
    String allSongsPgCSSPath = "section#songsWrapper";
    String allBtnAllSongsPgCSSPath = "section#songsWrapper button.btn.btn-orange.btn-shuffle-all";
    String addToBtnAllSongsPgCSSPath = "button.btn.btn-green.btn-add-to";


    //  x path selectors
    String playListNamePart1XPath = "//*[@href='#!/playlist/";
    String playerFavoritesXPath = "//*[@href='#!/favourites']";
    String playerControlXPath = "[@href='#!/favourites']";
    String createNewPlayListXPath = "//*[@class = 'create']/*";
    /*String emptyPlayListNamingFieldXPath = "//*[@class = 'create']/*";*/


    /*WEB ELEMENTS*/
/*

    //  css Selector webElements
    WebElement cssPathLoginEmailBox = webDriver.findElement(By.cssSelector("[type='email']"));
    WebElement cssPathLoginPassword = webDriver.findElement(By.cssSelector("[type='password']"));
    WebElement cssPathLoginButton = webDriver.findElement(By.cssSelector("[type='submit']"));
    WebElement cssPathCreatePlayListCircle = webDriver.findElement(By.cssSelector("i.create"));
    WebElement cssPathNewPlaylistCircle = webDriver.findElement(By.cssSelector(".fa.fa-playlist-circle"));
    WebElement cssPathCreateNewPlayListCircle = webDriver.findElement(By.cssSelector("i.fa.fa-plus-circle.control.create"));
    WebElement cssPathCreatePlyLstCrcl = webDriver.findElement(By.cssSelector(".fa.fa-plus-circle"));
    WebElement cssPathCreatePlyLstCrclwoDots = webDriver.findElement(By.cssSelector(".fa fa-plus-circle control create"));

    WebElement cssPathEmptyPlayListNamingField = webDriver.findElement(By.cssSelector("form.create input[type=text]"));
    WebElement cssPathFavourites = webDriver.findElement(By.cssSelector("a[href='#!/favorites']"));
    WebElement cssPathPlayListCreationSuccess = webDriver.findElement(By.cssSelector(".success.show"));
    WebElement cssPathPlaylistNameList = webDriver.findElement(By.cssSelector("a[href='#!/playlist/"));

    WebElement cssPathHome = webDriver.findElement(By.cssSelector("[href='#!/home']"));
    WebElement cssPathAllBtnFavoritesPg = webDriver.findElement(By.cssSelector("section#playlistWrapper button.btn.btn-orange.btn-shuffle-all"));
    WebElement cssPathClearBtnFavoritesPg = webDriver.findElement(By.cssSelector("button.del.btn.btn-red.btn-delete-playlist"));
    WebElement cssPathChkClearBtnFunctionality = webDriver.findElement(By.cssSelector("section#queueWrapper"));

    WebElement cssPathAllSongsLink = webDriver.findElement(By.cssSelector("[href='#!/albums']"));
    WebElement cssPathAllSongsPg = webDriver.findElement(By.cssSelector("section#songsWrapper"));
    WebElement cssPathAllBtnAllSongsPg = webDriver.findElement(By.cssSelector("section#songsWrapper button.btn.btn-orange.btn-shuffle-all"));
    WebElement cssPathAddToBtnAllSongsPg = webDriver.findElement(By.cssSelector("button.btn.btn-green.btn-add-to"));

    WebElement cssPathPlayBtnPlayerCtrl = webDriver.findElement(By.cssSelector("span.play.control i.fa.fa-play"));
    WebElement cssPathPauseBtnPlayerCtrl = webDriver.findElement(By.cssSelector("span.pause.control"));
    WebElement cssPathPrevBtnPlayerControl = webDriver.findElement(By.cssSelector("i.prev.fa.fa-step-backward.control"));
    WebElement cssPathNextPlayerControl = webDriver.findElement(By.cssSelector("i.next.fa.fa-step-forward.control"));
    WebElement cssPathRepeatBtn = webDriver.findElement(By.cssSelector("i.fa.fa-repeat"));
    WebElement cssPathMuteVolumePlayerCtrl = webDriver.findElement(By.cssSelector("i.fa.fa-volume-up.mute"));
    WebElement cssPathUnMuteVolumePlayerCtrl = webDriver.findElement(By.cssSelector("i.fa.fa-volume-off.unmute"));

    //  x path selectors webElements
    WebElement xPathPlayListNamePart1 = webDriver.findElement(By.xpath("//*[@href='#!/playlist/"));
    WebElement xPathPlayerFavorites = webDriver.findElement(By.xpath("//*[@href='#!/favourites']"));
    WebElement xPathPlayerControl = webDriver.findElement(By.xpath("@href='#!/favourites']"));
    WebElement xPathCreateNewPlayList = webDriver.findElement(By.xpath("//*[@class = 'create']/*"));
    WebElement xPathEmptyPlayListNamingField = webDriver.findElement(By.xpath("//*[@class = 'create']/*"));


    */
/*String checkCreatePlaylistPlusBtnWrking = "i.creating";*//*

    */
/*String checkCreatePlaylistPlusBtnWrking = "i.creating";*//*

    */
/*String playerControlAtFooterCSSPath = "div#playerControls.side.player-controls i.fa.fa-play";*//*

    */
/*WebElement cssPathPlayerControlAtFooter = webDriver.findElement(By.cssSelector("div#playerControls.side.player-controls i.fa.fa-play"));*/


}
