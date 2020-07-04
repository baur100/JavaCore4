package hw12;

public class Seoul extends Busan {
  private String river;

  public Seoul(String food, boolean ocean, String river) {
    super(food, ocean);
    this.river = river;
  }



  public String getRiver() {
    return river;
  }

  public void setRiver(String river) {
    this.river = river;
  }

  @Override
  public void printCountryInfo() {
    super.printCountryInfo();
    System.out.println("Seoul has a beautiful river which across the city. "
        + "It's called " +river +" river.");
  }
}
