package ModelsYK;

public class PostPlaylistRequest {
    private String name;
    private int id;

    public PostPlaylistRequest(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
