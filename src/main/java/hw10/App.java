package hw10;

public class App {

  public static void main(String[] args) {
    BeverageMenu emptyMenu = new BeverageMenu();
    emptyMenu.setBaseAlcohol("vodka");

    System.out.println(emptyMenu.getCocktailName());
    emptyMenu.setCocktailName("My new cockatail");
    System.out.println(emptyMenu.getCocktailName());
    System.out.println(emptyMenu.getBaseAlcohol());
    FoodMenu myMenu = new FoodMenu("Coke");
    myMenu.orderMenu();
    System.out.println("***********************************************************");
    FoodMenu customMenu = new FoodMenu("Cheese burger", 5.0, "Diet Coke");
    customMenu.orderMenu();
    System.out.println("***********************************************************");
    customMenu.setFoodItemName1("French fries");
    customMenu.setFoodItemPrice1(3.0);
    customMenu.orderMenu();
    System.out.println("---------------------------------------------------------------");
    System.out.println("---------------------------------------------------------------");
    BeverageMenu cosmopolitan = new BeverageMenu("Cosmopolitan", 10.00, "Vodka");
    cosmopolitan.orderDrinks();
    System.out.println("***********************************************************");
    cosmopolitan.setCocktailName("Margarita");
    cosmopolitan.setBaseAlcohol("Tequila");
    cosmopolitan.orderDrinks();
    System.out.println("---------------------------------------------------------------");
    System.out.println("---------------------------------------------------------------");
    DessertMenu myDessert = new DessertMenu("Cheesecake", 5,"Oatmeal cookie", 3, "Strawberry icecream", 2) ;
   myDessert.calculatePrice();
   myDessert.orderDessert();
    System.out.println("***********************************************************");
   myDessert.setCakeName("Chocolate cake");
   myDessert.orderDessert();
    System.out.println("---------------------------------------------------------------");
    System.out.println("---------------------------------------------------------------");
    KidsMenu andrewKid = new KidsMenu("Donuts", 5.0, "Andrew");
    KidsMenu amykid = new KidsMenu("Amy");
    System.out.println("***********************************************************");
    amykid.getKidsItem();
    System.out.println(amykid.getKidsItem());
    amykid.setKidsItem("King donuts");
    System.out.println(amykid.getKidsItem());


  }
}
