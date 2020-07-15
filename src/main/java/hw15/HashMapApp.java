package hw15;

import java.util.HashMap;

public class HashMapApp {

  public static void main(String[] args) {
    HashMap<Integer,String>menu1 = new HashMap<Integer,String>();
    menu1.put(1, "Iced Americano");
    menu1.put(2, "Iced Latte");
    menu1.put(3, "Iced water");
    System.out.println(menu1);
    menu1.remove(3);
    System.out.println(menu1);
    menu1.replace(2, "Iced water");
    System.out.println(menu1);
    System.out.println(menu1.size());
    menu1.put(5, "Kids size hot chocolate");

//How to print out keys + values
    for (int i :menu1.keySet()) {
      System.out.println("#"+i + " Menu: "+menu1.get(i));
    }
  }

}
