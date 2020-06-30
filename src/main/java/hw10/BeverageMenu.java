package hw10;

public class BeverageMenu {
  private String cocktailName;
  private double cocktailPrice;
  private String baseAlcohol;

  public String getCocktailName() {
    return cocktailName;
  }

  public double getCocktailPrice() {
    return cocktailPrice;
  }

  public String getBaseAlcohol() {
    return baseAlcohol;
  }

  public void setCocktailName(String cocktailName) {
    this.cocktailName = cocktailName;
  }

  public void setCocktailPrice(double cocktailPrice) {
    this.cocktailPrice = cocktailPrice;
  }

  public void setBaseAlcohol(String baseAlcohol) {
    this.baseAlcohol = baseAlcohol;
  }

  public BeverageMenu(String cocktailName, double cocktailPrice, String baseAlcohol) {
    this.cocktailName = cocktailName;
    this.cocktailPrice = cocktailPrice;
    this.baseAlcohol = baseAlcohol;
  }
  public void orderDrinks(){
    System.out.println("You have ordered " +cocktailName+". This is based with " +baseAlcohol+
        ". The price is $" + cocktailPrice);
  }
}
