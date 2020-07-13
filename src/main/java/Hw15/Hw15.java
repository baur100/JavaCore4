package Hw15;


import java.util.HashMap;
import java.util.Map;

public class Hw15 {
    public static void main(String[] args) {


//        Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//                add 4 elements to each hashmap
//        try methods  put/replace/remove/get/foreach
//        Create 2 Enums
//        Create 2 classes
//                - first will have field with type enum
//        - second - field as ArrayList<enum.type>
//

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Guatemala", "Guatemala City");
        map.put("Kazakhstan", "Astana");
        map.put("Uzbekistan", "Tashkent");
        map.put("Italy", "Rome");

        System.out.println(map);

        map.put("Jamaica", "Kingston");
        map.put("Israel", "Jerusalem");
        System.out.println(map);

        map.replace("Kazakhstan", "Almaty");
        System.out.println(map);

        map.remove("Italy");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("_______________________________");

        HashMap<Integer, String> mm = new HashMap<Integer, String>();
        mm.put(0, "Sweet");
        mm.put(1, "Sour");
        mm.put(2, "Salty");
        mm.put(3, "Bitter");
        mm.put(4, "Pungent");
        System.out.println(mm);

        System.out.println(mm.get(2));

        mm.remove(3, "Bitter");
        System.out.println(mm);

        mm.put(4, "Refreshing");
        System.out.println(mm);

        for (int i = 0; i <= mm.size(); i++) System.out.println(i);

        for (String value : mm.values()) {
            System.out.println(value);
        }


        System.out.println("_______________________________");

        Map<String, String> veggies = new HashMap<String, String>();
        veggies.put("Broccoli", "Green");
        veggies.put("Squash", "Yellow");
        veggies.put("Red cabbage", "Purple");
        veggies.put("Onion", "White");
        veggies.put("Tomato", "Red");
        System.out.println(veggies);

        for (String key : veggies.keySet()) {
            System.out.println(key);
        }
        for (String value : veggies.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : veggies.entrySet()) {
            System.out.println(pair.getKey() + "       " + pair.getValue());
        }


        System.out.println("_______________________________");


//        Map<Person1, Occupation> dd = new HashMap<Person1, Occupation>();
//        dd.put(new Person1(), new Occupation());
//        dd.put(new Person1(), new Occupation());
//        dd.put(new Person1(), new Occupation());
//
////      dd.put("Jane Smith","designer");
//
//        System.out.println(dd);


    }
}




