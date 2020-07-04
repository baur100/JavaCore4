package hw12;

public class Korea extends Country{

  private String food;
  public Korea(String food) {
    super("Asia", "Korea", "Won");
    this.food = food;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }


  @Override
  public void printCountryInfo() {
    super.printCountryInfo();
    System.out.println("My favorite food from "+getName()+ " is " +this.getFood());
  }

}
