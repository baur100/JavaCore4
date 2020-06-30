package hw10;

public class KidsMenu {
  private String kidsItem;
  private double kidsPrice;
  private String kidsName;

  public KidsMenu(String kidsName) {
    this.kidsItem = "Chicken nuggets";
    this.kidsPrice = 5.5;
    this.kidsName = kidsName;
    System.out.println("Hello, "+kidsName+"! You've selected kids meal! "
        + "It comes with Chicken nugget and the price is only $5.5!");
  }

  public KidsMenu(String kidsItem, double kidsPrice, String kidsName) {
    this.kidsItem = kidsItem;
    this.kidsPrice = kidsPrice;
    this.kidsName = kidsName;

    System.out.println("Hello, "+kidsName+"! You've selected kids meal! "
        + "It comes with " +kidsItem+ " and the price is only " +kidsPrice +"!");

  }

  public String getKidsItem() {
    return kidsItem;
  }

  public void setKidsItem(String kidsItem) {
    this.kidsItem = kidsItem;
  }

  public double getKidsPrice() {
    return kidsPrice;
  }

  public void setKidsPrice(double kidsPrice) {
    this.kidsPrice = kidsPrice;
  }

  public String getKidsName() {
    return kidsName;
  }

  public void setKidsName(String kidsName) {
    this.kidsName = kidsName;
  }


}
