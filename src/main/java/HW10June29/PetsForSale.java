package HW10June29;

public class PetsForSale {
    private String petType;
    private String petName;
    private int petAge;
    private double petWeight;
    private double petPrice;

    public PetsForSale(){}

    public PetsForSale(String petType, String petName, double petPrice){
        this.petType = petType;
        this.petName = petName;
        this.petPrice = petPrice;
    }

    public PetsForSale(String petType, String petName, int petAge, double petWeight, double petPrice){
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.petWeight = petWeight;
        this.petPrice = petPrice;
    }

    public void printInfo(){
        System.out.println("\nA "+petAge+" year old "+petType+" named "+petName+", weighing "+petWeight+"lb, costs $"+petPrice);
    }

    public void setPetType(String petType){ this.petType = petType; }
    public String getPetType(){return petType;}

    public void setPetName(String petName){this.petName = petName;}
    public String getPetName(){return petName;}

    public void setPetAge(int age){ this.petAge = age;}
    public int getPetAge(){return petAge;}

    public void setPetWeight(double petWeight){ this.petWeight = petWeight;}
    public double getPetWeight(){return petWeight;}

    public void setPetPrice(double petPrice){ this.petPrice = petPrice;}
    public double getPetPrice(){return petPrice;}
}
