package mHardCodedObjects;

public interface HtmlPathSelectors {

    //  css Selector paths
    public String loginEmailBoxCssPath = "[type='email']";
    public String loginPasswordCssPath = "[type='password']";
    public String loginButtonCssPath = "[type='submit']";
    public String createPlayListCircleCssPath = "i.create";
    public String newPlaylistCircleCssPath = ".fa.fa-playlist-circle";
    public String createNewPlayListCircleCSSPath = "i.fa.fa-plus-circle.control.create";
    public String createPlyLstCrclCSSPath = ".fa.fa-plus-circle";
    public String createPlyLstCrclCSSPatwoDots = ".fa fa-plus-circle control create";

    public  String emptyPlayListNamingFieldCssPath = "form.create input[type=text]";
    public String favouritesCssPath = "[href='#!/favorites']";
    public String playListCreationSuccessCssPath = ".success.show";
    public String playlistNameListCSSPath = "a[href='#!/playlist/";
    //  public String checkCreatePlaylistPlusBtnWrking = "i.creating";

    //  x path selectors
    public String playListNamePart1XPath = "//*[@href='#!/playlist/";
    public String playerFavoritesXPath = "//*[@href='#!/favourites']";
    public String playerControlXPath = "@href='#!/favourites']";
    public String createNewPlayListXPath = "//*[@class = 'create']/*";
    public String emptyPlayListNamingFieldXPath = "//*[@class = 'create']/*";

}
