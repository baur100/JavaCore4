package hw15;

import java.util.HashMap;

public class HasMapApp2 {

  public static void main(String[] args) {
    HashMap<String, String> list = new HashMap<String, String>();
    list.put("England", "London");
    list.put("Korea", "Seoul");
    list.put("Russia", "Moscow");
    list.put("USA", "New york");
    System.out.println(list);
    list.replace("USA", "Washington DC");

    //How to print out keys + values
    for (String i:list.keySet()
    ) {
      System.out.println("Country: " +i +", Capital City: "+list.get(i));
    }
  }
}
