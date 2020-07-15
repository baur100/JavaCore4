package hw15;

public class Food {
  private String foodName;
  private int yearOfMade;

  public Food(String foodName, int yearOfMade) {
    this.foodName = foodName;
    this.yearOfMade = yearOfMade;
  }

  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public int getYearOfMade() {
    return yearOfMade;
  }

  public void setYearOfMade(int yearOfMade) {
    this.yearOfMade = yearOfMade;
  }

  @Override
  public String toString() {
    return "************************"+
        "\nFood Name='" + foodName + '\'' +
        ", Year Of Made=" + yearOfMade;
  }
}
