package HW10June29;

public class PetAccessories {
    private String petHouse;
    private double petHousePrice;
    private String petMattress;
    private double petMattressPrice;
    private String petToys;
    private double petToysPrice;
    private String petDress;
    private double petDressPrice;

    public PetAccessories(){}

    public PetAccessories(String petHouse, double petHousePrice, String petMattress, double petMattressPrice, String petToys, double petToysPrice, String petDress, double petDressPrice) {
        this.petHouse = petHouse;
        this.petHousePrice = petHousePrice;
        this.petMattress = petMattress;
        this.petMattressPrice = petMattressPrice;
        this.petToys = petToys;
        this.petToysPrice = petToysPrice;
        this.petDress = petDress;
        this.petDressPrice = petDressPrice;
    }

    public PetAccessories(String petHouse, String petMattress, String petToys, String petDress) {
        this.petHouse = petHouse;
        this.petMattress = petMattress;
        this.petToys = petToys;
        this.petDress = petDress;
    }

    public PetAccessories(double petHousePrice, double petMattressPrice, double petToysPrice, double petDressPrice) {
        this.petHousePrice = petHousePrice;
        this.petMattressPrice = petMattressPrice;
        this.petToysPrice = petToysPrice;
        this.petDressPrice = petDressPrice;
    }

    public void printInfo(){
        System.out.println("\nThe lists of Pet Accessories with its respective price are as follows:\n" +
                petHouse+" = "+petHousePrice+"\n"+
                petMattress+" = "+petMattressPrice+"\n"+
                petToys+" = "+petToysPrice+"\n"+
                petDress+" = "+petDressPrice);
    }

    public String getPetHouse() { return petHouse; }
    public void setPetHouse(String petHouse) { this.petHouse = petHouse; }

    public double getPetHousePrice() { return petHousePrice; }
    public void setPetHousePrice(double petHousePrice) { this.petHousePrice = petHousePrice; }

    public String getPetMattress() { return petMattress; }
    public void setPetMattress(String petMattress) { this.petMattress = petMattress; }

    public double getPetMattressPrice() { return petMattressPrice; }
    public void setPetMattressPrice(double petMattressPrice) { this.petMattressPrice = petMattressPrice; }

    public String getPetToys() { return petToys; }
    public void setPetToys(String petToys) { this.petToys = petToys; }

    public double getPetToysPrice() { return petToysPrice; }
    public void setPetToysPrice(double petToysPrice) { this.petToysPrice = petToysPrice; }

    public String getPetDress() { return petDress; }
    public void setPetDress(String petDress) { this.petDress = petDress; }

    public double getPetDressPrice() { return petDressPrice; }
    public void setPetDressPrice(double petDressPrice) { this.petDressPrice = petDressPrice; }

}
