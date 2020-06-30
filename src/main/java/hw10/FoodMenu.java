package hw10;

public class FoodMenu {
  private String foodItemName1;
  private double foodItemPrice1;
  private String soda;

  public void setSoda(String soda) {
    this.soda = soda;
  }

  public String getSoda() {
    return soda;
  }

  public void setFoodItemName1(String foodItemName1) {
    this.foodItemName1 = foodItemName1;
  }

  public void setFoodItemPrice1(double foodItemPrice1) {
    this.foodItemPrice1 = foodItemPrice1;
  }

  public String getFoodItemName1() {
    return foodItemName1;
  }

  public double getFoodItemPrice1() {
    return foodItemPrice1;
  }


  public FoodMenu(String foodItemName1, double foodItemPrice1, String soda) {
    this.foodItemName1 = foodItemName1;
    this.foodItemPrice1 = foodItemPrice1;
    this.soda = soda;

    System.out.println("You have selected " +foodItemName1 +" and " +soda+" as your free drink.");
  }

  public FoodMenu(String soda) {
    this.foodItemName1 = "The best pepperoni pizza in town";
    this.foodItemPrice1 = 7.0;
    this.soda = soda;
    System.out.println("You have selected " +soda + " as your free drink.");
  }

  public void orderMenu(){
    System.out.println("You have ordered " +this.foodItemName1 + " and it would be $" +foodItemPrice1);
  }

}
