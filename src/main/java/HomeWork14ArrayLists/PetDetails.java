package HomeWork14ArrayLists;

public class PetDetails implements PetShop{
    protected String petName;
    protected String petType;
    protected String petBreed;
    protected int petAge;
    protected String petFood;
    protected String petSnack;
    protected String petBvg;
    protected String petHouse;
    protected String petMattress;
    protected String petSize;

    public PetDetails(String petName, String petType, String petBreed, int petAge, String petFood, String petSnack, String petBvg, String petHouse, String petMattress, String petSize) {
        this.petName = petName;
        this.petType = petType;
        this.petBreed = petBreed;
        this.petAge = petAge;
        this.petFood = petFood;
        this.petSnack = petSnack;
        this.petBvg = petBvg;
        this.petHouse = petHouse;
        this.petMattress = petMattress;
        this.petSize = petSize;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return this.petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    @Override
    public int age() {
        return this.petAge;
    }

    @Override
    public String petFood() {
        return this.petFood;
    }

    @Override
    public String petSnack() {
        return this.petSnack;
    }

    @Override
    public String petBvg() {
        return this.petBvg;
    }

    @Override
    public String petHouse() {
        return this.petHouse;
    }

    @Override
    public String petMattress() {
        return this.petMattress;
    }

    @Override
    public String petSize() {
        return this.petSize;
    }

}
