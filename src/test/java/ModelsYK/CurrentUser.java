package ModelsYK;

public class CurrentUser {
    private int id;
    private String name;
    private String email;
    private boolean is_admin;
    private Preferences[] preferences;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public Preferences[] getPreferences() {
        return preferences;
    }
}
