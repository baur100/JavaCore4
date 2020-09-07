package ModelsYK;

public class SongsInPls {
    private String id;
    private int album_id;
    private int artist_id;
    private String title;
    private double length;
    private int track;
    private int disc;
    private String created_at;
    private Pivot pivot;

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

    public double getLength() {
        return length;
    }

    public int getTrack() {
        return track;
    }

    public int getDisc() {
        return disc;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Pivot getPivot() {
        return pivot;
    }
}
