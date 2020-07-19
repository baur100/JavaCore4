package Hw15;


import Hw14.Mushroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        map.put("Jamaica", "Kingston");
        map.put("Israel", "Jerusalem");

        System.out.println("_____________HashMap- <String,String>__________________");
        System.out.println("Method Put");
        System.out.println(map);

        System.out.println("________________________________________________________");

        map.replace("Kazakhstan", "Almaty");
        System.out.println("Method Replace");
        System.out.println(map);
        System.out.println("________________________________________________________");

        map.remove("Italy");
        System.out.println("Method Remove");
        System.out.println(map);
        System.out.println("________________________________________________________");

        map.get("Jamaica");
        System.out.println("Method Get");
        System.out.println(map.get("Jamaica"));
        System.out.println("________________________________________________________");

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("Method forEach");
        System.out.println(map);
        System.out.println("________________________________________________________");

        HashMap<Integer, String> mm = new HashMap<Integer, String>();
        mm.put(0, "Sweet");
        mm.put(1, "Sour");
        mm.put(2, "Salty");
        mm.put(3, "Bitter");
        mm.put(4, "Pungent");


        System.out.println("_______________HashMap<Integer, String>_________________");
        System.out.println("Method Put");
        System.out.println(mm);
        System.out.println("________________________________________________________");

        mm.replace(3, "Bitter", "Refreshing");
        System.out.println("Method Replace");
        System.out.println(mm);
        System.out.println("________________________________________________________");

        mm.get(2);
        System.out.println("Method Get");
        System.out.println(mm.get(2));
        System.out.println("________________________________________________________");


        System.out.println("Method forEach");

        for (int i = 0; i <= mm.size(); i++) System.out.println(i);

        for (String value : mm.values()) {
            System.out.println(value);
        }

        System.out.println("________________________________________________________");

        mm.remove(1);
        System.out.println("Method Remove");
        System.out.println(mm);
        System.out.println("________________________________________________________");


        Map<String, String> veggies = new HashMap<String, String>();
        veggies.put("Broccoli", "Green");
        veggies.put("Eggplant", "Navy blue");
        veggies.put("Squash", "Yellow");
        veggies.put("Red cabbage", "Purple");
        veggies.put("Onion", "White");
        veggies.put("Tomato", "Red");


        System.out.println("_______________HashMap<String, String>_________________");
        System.out.println("Method Put");
        System.out.println(veggies);
        System.out.println("________________________________________________________");

        veggies.replace("Broccoli", "Green", "Dark green");
        System.out.println("Method Replace");
        System.out.println(veggies);
        System.out.println("________________________________________________________");

        veggies.remove("Reg cabbage");
        System.out.println("Method Remove");
        System.out.println(veggies);
        System.out.println("________________________________________________________");

        veggies.get("Onion");
        System.out.println("Method Get");
        System.out.println(veggies.get("Onion"));
        System.out.println("________________________________________________________");

        System.out.println("Method forEach");
        for (String key : veggies.keySet()) {
            System.out.println(key);
        }
        for (String value : veggies.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : veggies.entrySet()) {
            System.out.println(pair.getKey() + "       " + pair.getValue());
        }

        System.out.println(veggies);
        System.out.println("________________________________________________________");

        //HashMap custom classes <class1, class2>

        Person1 peter = new Person1("Peter Hollens");
        Occupation singer = new Occupation("singer", Education.BACHELOR);
        Person1 jane = new Person1("Jane Smith");
        Occupation designer = new Occupation("designer", Education.MASTERS);
        Person1 jasmin = new Person1("Jasmin Swarowski");
        Occupation model = new Occupation("model", Education.PROFESSIONAL);
        Person1 david = new Person1("David Granovski");
        Occupation attorney = new Occupation("attorney", Education.PHD);
        Person1 diana = new Person1("Diana Stremboni");
        Occupation scientist = new Occupation("scientist", Education.PHD);
        Occupation dentist = new Occupation("dentist", Education.PHD);
        Person1 damian = new Person1("Damian Loginski");
        Occupation programmer = new Occupation("programmer", Education.PROFESSIONAL);
        Person1 delia = new Person1("Delia WIlliams");
        Occupation teacher = new Occupation("teacher", Education.MASTERS);


        Map<Person1, Occupation> dd = new HashMap<Person1, Occupation>();
        dd.put(peter, singer);
        dd.put(jane, designer);
        dd.put(jasmin, model);
        dd.put(david, attorney);
        dd.put(diana, scientist);
        dd.put(damian, programmer);

        System.out.println("_______HashMap custom classes <class1, class2>__________________");
        System.out.println("Method Put");
        for (Map.Entry<Person1, Occupation> x : dd.entrySet()) {
            Person1 person1 = x.getKey();
            Occupation occupation = x.getValue();
            System.out.println(person1.toString() + "   " + occupation.toString());
        }

        System.out.println("_______________________________");
        System.out.println("Method Remove");
        dd.remove(jane, designer);
        System.out.println(dd);


        System.out.println("_______________________________");

        System.out.println("Method Replace");
        dd.replace(diana, scientist, dentist);
        System.out.println(dd);

        System.out.println("_______________________________");

        System.out.println("Method Remove");
        dd.remove(damian, programmer);
        System.out.println(dd);

        System.out.println("_______________________________");

        System.out.println("Method Get");
        dd.get(peter);
        System.out.println(dd.get(peter));

        System.out.println("_______________________________");

        System.out.println("Method forEach");
        for (Map.Entry<Person1, Occupation> x : dd.entrySet()) {
            Person1 person1 = x.getKey();
            Occupation occupation = x.getValue();
            System.out.println(person1.toString() + "   " + occupation.toString());
        }

        System.out.println("_______________________________");

//        Create 2 Enums
//        Create 2 classes
//                - first will have field with type enum
//        - second - field as ArrayList<enum.type>

        // Calling values()
        Color arr[] = Color.values();

        // enum with loop
        for (Color v : arr) {
            System.out.println(v);
        }

        ArrayList<Car> car = new ArrayList<>();
        car.add(new Car("Porsche", "Cayenne", Color.RED, 2020));
        car.add(new Car("Alpha Romeo", "Stelvio", Color.BLUE, 2020));
        car.add(new Car("Maserati", "Levante", Color.PURPLE, 2020));

        for (Car carr : car) {
            carr: carr.printInfo();
        }
    }
}




