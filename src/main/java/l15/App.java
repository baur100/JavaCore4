package l15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("Germany","Berlin");
//        map.put("Austria","Vienna");
//        map.put("Great Britain","London");
//        map.put("India","Delhi");
//
//        map.put("XXXX","London");
//        map.put("XXXX","Berlin");
//
//        System.out.println(map);
//        System.out.println(map.get("India"));
//
//        HashMap<Integer,String>arrayListLikeStructure = new HashMap<Integer, String>();
//        arrayListLikeStructure.put(0,"Green");
//        arrayListLikeStructure.put(1,"Yellow");
//        arrayListLikeStructure.put(2,"Grey");
//        System.out.println(arrayListLikeStructure.get(2));
//
//        map.remove("XXXX");
//        System.out.println(map);
//
//        map.replace("Germany","Bonn");
//        System.out.println(map);
//
//        System.out.println(map.size());

        Map<String,String> fruits = new HashMap<String,String>();
        fruits.put("Apple","Sweet");
        fruits.put("Lemon","Sour");
        fruits.put("Lime","Sour");
        fruits.put("Peach","Sweet");
        fruits.put(null,"Null taste");
        System.out.println(fruits);

        for(String key: fruits.keySet()){
            System.out.println(key);
        }
        for(String value : fruits.values()){
            System.out.println(value);
        }

        for(Map.Entry<String,String> pair : fruits.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

        Map<Person,Subject> pp = new HashMap<Person,Subject>();
        pp.put(new Person(),new Subject());
        pp.put(new Person(),new Subject());
        System.out.println(pp.size());
    }
}
