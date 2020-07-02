package hw11;

import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    String[] list = {"Water", "BBQ beef", "Apple", "Canned tuna", "Top ramen noodle"};
    ShoppingList grocery = new ShoppingList(list,"Amy");

   CampingTrip myCampingTrip = new CampingTrip(grocery, "Acton campsite", "May 31st, 2021");
  myCampingTrip.printCampingInto();
  grocery.printGroceryList();
    System.out.println();
  System.out.println("******************************");

  myCampingTrip.setCampSite("New Hawaiian Desert");
  myCampingTrip.printCampingInto();
  grocery.setShopperName("Andrew");
  String[] newList = {"Spam", "Rice", "Chocolate", "Ice", "Ice cream"};
  grocery.setGroceryList(newList);
  grocery.printGroceryList();
  }


}
