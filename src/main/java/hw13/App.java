package hw13;

public class App {
//  Create an interface and 2 classes which implements it
//  Create 2 objects of each class
//  Assign one object to interface type

  public static void main(String[] args) {
    hydroFlask myBottle = new hydroFlask("Red", 20, "Hydro flask");
    myBottle.getInfo();
    myBottle.pourOut();
    System.out.println("******************");
    waterBottle secondBottle = new hydroFlask("Blue", 20, "Yeti");
    secondBottle.getInfo();
    secondBottle.fillUp();
    System.out.println("******************");
    waterBottle myGlass = new waterGlass("crystal", 8, "martini");
    myGlass.getInfo();
    myGlass.fillUp();


  }
}
