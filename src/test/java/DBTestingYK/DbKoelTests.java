package DBTestingYK;

import ModelsYK.Albums;
import ModelsYK.Playlists;
import ModelsYK.Songs;
import helpersYK.DbAdapter;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DbKoelTests {
    @Test
    public void getPlaylistById(){
        Playlists pl = DbAdapter.getPlaylistById(8357);
        Assert.assertEquals(pl.getName(), "zzzz");
    }

    @Test
    public void getAllPlaylists(){
        List<Playlists> playlistsList = DbAdapter.getAllPlaylist(9);
        for (int i = 0; i<playlistsList.size(); i++){
            System.out.println("name = "+ playlistsList.get(i).getName() + "," + " id = " + playlistsList.get(i).getId());
        }
        System.out.println(playlistsList.size());
        Assert.assertTrue(playlistsList.size()>0);
    }

    @Test
    public void getAllAlbums(){
        List<Albums> albumsList = DbAdapter.getAllAlbums();
        for (Albums alb:albumsList){
            System.out.println("name = "+ alb.getName() + "," + " Album id = " + alb.getId() + "," + " Artist id = " + alb.getArtist_id());
        }
        System.out.println(albumsList.size());
        Assert.assertTrue(albumsList.size()>0);
    }

    @Test
    public void getAllSongsOfPlaylist (){
        List<Songs> songsList = DbAdapter.getAllPlaylistSongs(8357);
        for(Songs sng: songsList){
            System.out.println(sng.getTitle());
        }
        System.out.println(songsList.size());
        Assert.assertTrue(songsList.size()>0);
    }
}
