package ModelsYK;

public class Playlists {
    private int id;
    private String name;
    private String[] rules;
    private boolean is_smart;

    public Playlists(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getRules() {
        return rules;
    }

    public boolean isIs_smart() {
        return is_smart;
    }
}
