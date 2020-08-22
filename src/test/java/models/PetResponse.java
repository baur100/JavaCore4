package models;

public class PetResponse {
    private long id;
    private CategoryResponse category;
    private String name;
    private String[] photoUrls;
    private TagResponse[] tags;
    private String status;

    public long getId() {
        return id;
    }

    public CategoryResponse getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public TagResponse[] getTags() {
        return tags;
    }

    public String getStatus() {
        return status;
    }
}
