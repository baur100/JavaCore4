package ModelsYK;

public class PostPetRequest extends PetBase{


    public PostPetRequest(Category category, String name, String[] photoUrls, Tag[] tags, String status) {
        super(category, name, photoUrls, tags, status);
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
