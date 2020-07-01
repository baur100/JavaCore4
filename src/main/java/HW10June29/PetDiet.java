package HW10June29;

public class PetDiet {

    private String petFood;
    private double petFoodPrice;
    private String petDrink;
    private double petDrinkPrice;
    private String petSnack;
    private double petSnackPrice;
    private String petCandy;
    private double petCandyPrice;
    private String petChew;
    private double petChewPrice;


    public PetDiet(){}

    public PetDiet(String petFood, double petFoodPrice, String petDrink, double petDrinkPrice, String petSnack, double petSnackPrice, String petCandy, double petCandyPrice, String petChew, double petChewPrice) {
        this.petFood = petFood;
        this.petFoodPrice = petFoodPrice;
        this.petDrink = petDrink;
        this.petDrinkPrice = petDrinkPrice;
        this.petSnack = petSnack;
        this.petSnackPrice = petSnackPrice;
        this.petCandy = petCandy;
        this.petCandyPrice = petCandyPrice;
        this.petChew = petChew;
        this.petChewPrice = petChewPrice;
    }


    public PetDiet(String petFood, String petDrink, String petSnack, String petCandy, String petChew) {
        this.petFood = petFood;
        this.petDrink = petDrink;
        this.petSnack = petSnack;
        this.petCandy = petCandy;
        this.petChew = petChew;
    }

    public PetDiet(double petFoodPrice, double petDrinkPrice, double petSnackPrice, double petCandyPrice, double petChewPrice){
        this.petFoodPrice = petFoodPrice;
        this.petDrinkPrice = petDrinkPrice;
        this.petSnackPrice = petSnackPrice;
        this.petCandyPrice = petCandyPrice;
        this.petChewPrice = petChewPrice;
    }

    public void printInfo(){
        System.out.println("\nThe Pet Diet Prices are as follows:\n" +
                        petFood+" = "+petFoodPrice+"\n"+
                        petDrink+" = "+petDrinkPrice+"\n"+
                        petSnack+" = "+petSnackPrice+"\n"+
                        petCandy+" = "+petCandyPrice+"\n"+
                        petChew+" = "+petChewPrice);
    }

    public String getPetFood() { return petFood; }
    public void setPetFood(String petFood) { this.petFood = petFood; }

    public double getPetFoodPrice() { return petFoodPrice; }
    public void setPetFoodPrice(double petFoodPrice) { this.petFoodPrice = petFoodPrice; }

    public String getPetDrink() { return petDrink; }
    public void setPetDrink(String petDrink) { this.petDrink = petDrink; }

    public double getPetDrinkPrice() { return petDrinkPrice; }
    public void setPetDrinkPrice(double petDrinkPrice) { this.petDrinkPrice = petDrinkPrice; }

    public String getPetSnack() { return petSnack; }
    public void setPetSnack(String petSnack) { this.petSnack = petSnack; }

    public double getPetSnackPrice() { return petSnackPrice; }
    public void setPetSnackPrice(double petSnackPrice) { this.petSnackPrice = petSnackPrice; }

    public String getPetCandy() { return petCandy; }
    public void setPetCandy(String petCandy) { this.petCandy = petCandy; }

    public double getPetCandyPrice() { return petCandyPrice; }
    public void setPetCandyPrice(double petCandyPrice) { this.petCandyPrice = petCandyPrice; }

    public String getPetChew() { return petChew; }
    public void setPetChew(String petChew) { this.petChew = petChew; }

    public double getPetChewPrice() { return petChewPrice; }
    public void setPetChewPrice(double petChewPrice) { this.petChewPrice = petChewPrice; }

}
