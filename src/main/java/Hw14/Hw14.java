package Hw14;

import java.util.ArrayList;
import java.util.List;

public class Hw14 {
    public static void main(String[] args) {

//        Create 3 ArrayList - String, Integer and some Custom class
//        Add 4+ elements to each List
//        exercise methods add/set/remove/get/foreach and etc

        System.out.println("________________ArrayList - String______________________");
        ArrayList<String> garden = new ArrayList<String>();
        garden.add("Apple");
        garden.add("Mango");
        garden.add("Orange");
        garden.add("Peach");
        garden.add("Grapefruit");
        garden.add("Kiwi");
        garden.add("Pear");

        System.out.println("Method Add");
        System.out.println(garden);
        System.out.println("_______________________________________________________");

        garden.remove(0);
        System.out.println("Method Remove");
        System.out.println(garden);
        System.out.println("_______________________________________________________");

        System.out.println("Method Set");
        garden.set(3, "Grapes");
        System.out.println(garden);
        System.out.println("_______________________________________________________");

        System.out.println("Method Get");
        String a = garden.get(2);
//        System.out.println("List " + garden);

        System.out.println("the element at index 2 is " + a);
        System.out.println("_______________________________________________________");

        System.out.println("Method forEach");
        garden.forEach(v -> System.out.println(v));
        System.out.println("_______________________________________________________");

        System.out.println("Method Sublist");
        List<String> b = garden.subList(2, 4);

        // print the subList
        System.out.println("Sublist of garden: "
                + b);
        System.out.println("_______________________________________________________");

        System.out.println("Method removeAll");
        garden.removeAll(garden);
        System.out.println(garden);
        System.out.println("_______________________________________________________");


        System.out.println("___________________ArrayList Integer___________________");
        int n = 10;
        List<Integer> number = new ArrayList(10);
        number.add(7);
        number.add(8);
        number.add(5);
        number.add(9);
        number.add(3);
        number.add(1);
        number.add(2);
        number.add(6);
        number.add(4);
        number.add(18);
        number.add(15);

        System.out.println("Method Add");
        System.out.println(garden);
        System.out.println("_______________________________________________________");


        number.remove(5);
        System.out.println("Method Remove");
        System.out.println(garden);
        System.out.println("_______________________________________________________");

        number.set(8, 83);
        System.out.println("Method Set");
        System.out.println(garden);
        System.out.println("_______________________________________________________");

        int tt;
        tt = number.get(7);
        System.out.println("Method Get");
        System.out.println("the element at index 7 is " + tt);
        System.out.println("_______________________________________________________");

        System.out.println("Method forEach");
        number.forEach(v -> System.out.println(v));
        System.out.println("_______________________________________________________");


        System.out.println("_______________ArrayList Custom class___________________");

        ArrayList<Mushroom> mushroom = new ArrayList<>();
        mushroom.add (new Mushroom("Portobello"));
        mushroom.add (new Mushroom("Cremini"));
        mushroom.add (new Mushroom("Porcini"));
        mushroom.add (new Mushroom ("Shiitake"));
        mushroom.add (new Mushroom("Morel"));

        System.out.println("Method Add");
        System.out.println (mushroom);
        System.out.println("_______________________________________________________");

        mushroom.set(3, new Mushroom ("Maitake"));
        System.out.println("Method Set");
        System.out.println (mushroom);
        System.out.println("_______________________________________________________");

        System.out.println("Method Remove");
        mushroom.remove(2);
        System.out.println (mushroom.toString());
        System.out.println("_______________________________________________________");

        System.out.println("Method forEach");
        mushroom.forEach(System.out::println);

    }

}
