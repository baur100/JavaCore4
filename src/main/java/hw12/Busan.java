package hw12;

public class Busan extends Korea {

  private boolean ocean;

  public Busan(String food, boolean ocean) {
    super(food);
    this.ocean = ocean;
  }

  @Override
  public void printCountryInfo() {
    super.printCountryInfo();
    if(ocean == true) {
      System.out.println(getName() + " has ocean!");
    }
    else{
      System.out.println(getName() + " does not have ocean :(");
    }
  }

}


