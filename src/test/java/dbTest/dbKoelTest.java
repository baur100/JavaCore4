package dbTest;

import helpers.DbAdapter;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dbKoelTest {
    @Test
    public void getPlaylistById(){
        Playlist pl = DbAdapter.getPlaylistById(7519);
        Assert.assertEquals(pl.id, 7519);
        Assert.assertEquals(pl.name,"Leonardo");
    }
}
