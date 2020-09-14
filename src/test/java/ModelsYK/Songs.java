package ModelsYK;

public class Songs {
    private String id;
    private int album_id;
    private int artist_id;
    private String title;
    private String created_at;
    private int disc;
    private int track;
    private double length;

    public Songs(String id, String title, String created_at, double length) {
        this.id = id;
        this.title = title;
        this.created_at = created_at;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public String getTitle() {
        return title;
    }

    public String getCreated_at() {
        return created_at;
    }

    public int getDisc() {
        return disc;
    }

    public int getTrack() {
        return track;
    }

    public double getLength() {
        return length;
    }
}
