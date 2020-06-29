package hw9;

public class burger {
  public String name;
  public String breadType;
  public String meat;
  public double price;

  public String topping1Name;
  public double topping1Price;

  public String topping2Name;
  public double topping2Price;

  public burger(String name, String breadType, String meat, double price) {
    this.name = name;
    this.breadType = breadType;
    this.meat = meat;
    this.price = price;
  }

  public void addTopping1(String name,double price) {
    this.topping1Name = name;
    this.topping1Price = price;
  }

  public void addTopping2(String name, double price) {
    this.topping2Name = name;
    this.topping2Price = price;
  }

  public double totalPrice(){
    double hamburgerPrice = this.price;
    System.out.println(this.name + " hamburger is $" +this.price +
        ". It comes with " + this.breadType + " & " + this.meat + " patty.");

    if(this.topping1Name!= null){
      hamburgerPrice+=this.topping1Price;
      System.out.println("Added " +this.topping1Name + " for an extra $" + this.topping1Price );
    }
    if(this.topping2Name!= null){
      hamburgerPrice+=this.topping2Price;
      System.out.println("Added " +this.topping2Name + " for an extra $" + this.topping2Price );
    }
    return hamburgerPrice;
  }
}
