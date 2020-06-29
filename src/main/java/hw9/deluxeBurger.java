package hw9;

public class deluxeBurger extends burger {


  public deluxeBurger() {
    super("Deluxe", "Sesame bun", "Raindeer", 10.0);
    super.addTopping1("Chips", 1.0);
    super.addTopping2("Soda", 1.0);
  }

  @Override
  public void addTopping1(String name, double price) {
    System.out.println("You can't add any toppings for the deluxe burger.");
  }

  @Override
  public void addTopping2(String name, double price) {
    System.out.println("You can't add any toppings for the deluxe burger.");
  }


}
