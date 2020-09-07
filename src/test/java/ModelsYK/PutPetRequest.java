package ModelsYK;

public class PutPetRequest extends PetBase {
    private long id;

    public PutPetRequest(Category category, String name, String[] photoUrls, Tag[] tags, String status) {
        super(category, name, photoUrls, tags, status);
    }

    public void setId(long id) {
        this.id = id;
    }
}
