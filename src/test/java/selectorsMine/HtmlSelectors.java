package selectorsMine;

public interface HtmlSelectors {
    String loginUserName = "testpro.user04@testpro.io";
    String loginPassword = "te$tStudent";
    String newPlaylistName = "TestPlaylist";

//    css Selector paths
   public String newPlaylistSelector = ".fa.fa-playlist-circle";


//   x path selectors
   public String playListNameSelector = "//*[@href='#!/playlist/']";
   public String playerControlSelector = "@href='#!/favourites']";
   public String createPlayListSelector = "//*[@class = 'create']/*";

}
