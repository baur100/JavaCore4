package ModelsYK;

public class PetBase {
    protected Category category;
    protected String name;
    protected String [] photoUrls;
    protected Tag[] tags;
    protected String status;

    public PetBase(Category category, String name, String[] photoUrls, Tag[] tags, String status) {
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }



    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public Tag[] getTags() {
        return tags;
    }

    public String getStatus() {
        return status;
    }
}
