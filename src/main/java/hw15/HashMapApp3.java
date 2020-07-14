package hw15;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp3 {

  public static void main(String[] args) {
    HashMap<Food, Country> menu = new HashMap<Food,Country>();
//Q.: Is this a right way to add?
//    Country america = new Country("America", "San diego");
//    Food bbq = new Food("Phill's bbq", 1995);
//    Food sushi = new Food("Nijiya Sushi", 1993);
//    menu.put(bbq,america);
//    menu.put(sushi,america);
    menu.put(new Food("Ramen", 1995), new Country("Japan", "Tokyo"));

//Q.: How do you print out custom type class hashmap keysets + values?
    System.out.println(menu);

 //   for(Food i : menu.keySet()){
 //     System.out.println(i+ ": " +menu.get(i));
 //   }
  }

}
