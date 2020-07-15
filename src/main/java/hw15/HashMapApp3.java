package hw15;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp3 {

  public static void main(String[] args) {
    HashMap<Food, Country> menu = new HashMap<Food,Country>();

    Country america = new Country("America", "San diego");
    Food bbq = new Food("Phill's bbq", 1995);
    Food sushi = new Food("Nijiya Sushi", 1993);
    menu.put(bbq,america);
    menu.put(sushi,america);
    menu.put(new Food("Ramen", 1995), new Country("Japan", "Tokyo"));
    System.out.println("There are " + menu.size() +" menus that I would like to introduce to you.");
    Food IceCream = new Food("Salt& Straw Ice cream", 2002);
    Country LosAngeles = new Country("America", "Los Angeles");
    menu.put(IceCream,LosAngeles);

    System.out.println();
    System.out.println("There are " + menu.size() +" menus that I would like to introduce to you.");

//How to print out keys + values using methods in each class
    for(Map.Entry<Food, Country> i : menu.entrySet()){
      Food food = i.getKey();
      Country country = i.getValue();
      System.out.println(food.toString() + " | " + country.toString());
    }
  }

}
