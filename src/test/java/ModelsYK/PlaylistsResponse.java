package ModelsYK;

public class PlaylistsResponse {
    private int id;
    private String name;
    private SongsInPls[] songs;

    public SongsInPls[] getSongs() {
        return songs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
