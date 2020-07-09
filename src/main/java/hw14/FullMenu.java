package hw14;

public class FullMenu {
private String coffeeMenu;
private double price;

  public FullMenu(String size, double price) {
    this.coffeeMenu = size;
    this.price = price;
  }

  public String getCoffeeMenu() {
    return coffeeMenu;
  }

  public void setCoffeeMenu(String coffeeMenu) {
    this.coffeeMenu = coffeeMenu;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
