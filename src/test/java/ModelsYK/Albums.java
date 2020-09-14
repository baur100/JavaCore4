package ModelsYK;

public class Albums {
    private int id;
    private int artist_id;
    private String name;

    public Albums(int id, int artist_id, String name) {
        this.id = id;
        this.artist_id = artist_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public String getName() {
        return name;
    }
}
