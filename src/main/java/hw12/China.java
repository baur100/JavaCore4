package hw12;

public class China extends Country {
  private String favoriteColor;

  public China(String favoriteColor) {
    super("Asia", "China", "Yuan");
    this.favoriteColor = favoriteColor;
  }

  public String getFavoriteColor() {
    return favoriteColor;
  }

  public void setFavoriteColor(String favoriteColor) {
    this.favoriteColor = favoriteColor;
  }

  @Override
  public void printCountryInfo() {
    super.printCountryInfo();
    System.out.println("Their favorite color is " +this.getFavoriteColor());
  }
  public void sayHello(){
    System.out.println("Ni hao!");
  }
}
