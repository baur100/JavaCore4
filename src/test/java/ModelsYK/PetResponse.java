package ModelsYK;

public class PetResponse extends PetBase{
    private long id;

    public PetResponse(Category category, String name, String[] photoUrls, Tag[] tags, String status, long id) {
        super(category, name, photoUrls, tags, status);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public Tag[] getTags() {
        return tags;
    }

    public String getStatus() {
        return status;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }
}
