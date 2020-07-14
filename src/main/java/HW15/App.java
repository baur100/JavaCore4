package HW15;

/*  1)Create 3 HashMaps- <String,String>, <Integer,String> and custom classes <Class1,Class2>
Add 4 elements to each hashmap. Try methods  put/replace/remove/get/foreach
    2)Create 2 Enums
    Create 2 classes
    - first will have field with type enum
    - second - field as ArrayList<enum.type> */

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

//Hashmaps
//<String, String>
        HashMap<String, String> cities = new HashMap();
        cities.put("New York", "NY");
        cities.put("LA", "CA");
        cities.put("Ostin", "TX");
        cities.put("Trenton", "NJ");
        System.out.println(cities);
        for(String v: cities.values()) {
            System.out.println(v); }
        cities.get(2);
        cities.remove("CA");
        cities.replace("TX", "NH");


//<String, int>

        HashMap<String, Integer> price = new HashMap();
        price.put("Candies", 2);
        price.put("House", 200000);
        price.put("Rent", 1500);
        price.put("Car", 15000);
        System.out.println(price);
        for(Integer v: price.values()) {
            System.out.println(v);
        }
        price.get(3);
        price.remove(20000);
        price.replace("Car", 3);


//<String, Double>

        HashMap<String, Double> xx = new HashMap();
        xx.put("First", 2.75);
        xx.put("Second",4.34);
        xx.put("Third", 9.22);
        xx.put("Forth", 3.45);
        System.out.println(xx);
        for(Double v: xx.values()) {
            System.out.println(v);
        }
        xx.get(4);
        xx.remove(9.45);
        xx.replace("Third", 3.5);

//Enums

        Bags bags = new Bags("Chanel", "Dior", "Louis Vuitton");
        System.out.println(bags);

        Quality q = new Quality( 150, new Clothes[] {Clothes.DRESS, Clothes.PANTS, Clothes.SHIRT, Clothes.SOCKS, Clothes.SKIRT});

        //Sneakers nike = new Sneakers("Nike", "Air", new Colors[] {Colors.GREY, Colors.RED, Colors.WHITE});

    }
}
