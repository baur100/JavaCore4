package hw9;

public class healthyBurger extends burger {

  public healthyBurger() {
    super("Vegan", "Lettuce wrap", "Soybean", 7.0);
  }
  public String healthyTopping1Name;
  public double healthyTopping1Price;

  public String healthyTopping2Name;
  public double healthyTopping2Price;

  public String healthyTopping3Name;
  public double healthyTopping3Price;

  public void addHealthyTopping1(String name, double price){
    this.healthyTopping1Name = name;
    this.healthyTopping1Price =price;
  }
  public void addHealthyTopping2(String name, double price){
    this.healthyTopping2Name = name;
    this.healthyTopping2Price =price;
  }

  @Override
  public double totalPrice() {
    double hamburgerPrice = super.totalPrice();
    if(this.healthyTopping1Name!= null){
      hamburgerPrice+= healthyTopping1Price;
      System.out.println("Added "+this.healthyTopping1Name + " for an extra $" +this.healthyTopping1Price);
    }
    if(this.healthyTopping2Name!=null){
      hamburgerPrice+=healthyTopping2Price;
      System.out.println("Added "+this.healthyTopping2Name + " for an extra $" +this.healthyTopping2Price);
    }
    return hamburgerPrice;
  }
}
