package hw9;

public class kidsBurger extends burger {

  public kidsBurger( String breadType, String meat) {
    super("Junior", breadType, meat, 3.5);
  }
  public String comboMeal1Name;
  public double comboMeal1Price;

  public String comboMeal2Name;
  public double comboMeal2Price;

  public void addComboMeal1(String name, double price){
    this.comboMeal1Name = name;
    this.comboMeal1Price = price;
  }

  public void addComboMeal2(String name, double price){
    this.comboMeal2Name = name;
    this.comboMeal2Price = price;
  }

  @Override
  public double totalPrice() {
    double hamburgerPrice = super.totalPrice();
    if(this.comboMeal1Name != null){
      hamburgerPrice+=comboMeal1Price;
      System.out.println("Added " +comboMeal1Name + " for an extra $" + comboMeal1Price);
    }
    if(this.comboMeal2Name != null){
      hamburgerPrice+=comboMeal2Price;
      System.out.println("Added " +comboMeal2Name + " for an extra $" + comboMeal2Price);
    }
    return hamburgerPrice;
  }
}
