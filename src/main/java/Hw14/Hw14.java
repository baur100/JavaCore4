package Hw14;

import java.util.ArrayList;
import java.util.List;

public class Hw14 {
    public static void main(String[] args) {

//        Create 3 ArrayList - String, Integer and some Custom class
//        Add 4+ elements to each List
//        exercise methods add/set/remove/get/foreach and etc

        ArrayList<String> garden = new ArrayList<String>();
        garden.add("Apple");
        garden.add("Mango");
        garden.add("Orange");
        garden.add("Peach");
        garden.add("Grapefruit");
        garden.add("Kiwi");
        garden.add("Pear");

        System.out.println(garden);

        garden.remove(0);
        System.out.println(garden);

        garden.set(3, "Grapes");
        System.out.println(garden);


        String a = garden.get(2);
//        System.out.println("List " + garden);

        System.out.println("the element at index 2 is " + a);

        garden.forEach(v -> System.out.println(v));


        List<String> b = garden.subList(2, 4);

        // print the subList
        System.out.println("Sublist of garden: "
                + b);


        garden.removeAll(garden);
        System.out.println(garden);


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

        System.out.println(number);

        number.add(18);
        number.add(15);

        System.out.println(number);

        number.remove(5);

        System.out.println(number);

        number.set(8, 83);
        System.out.println(number);

        int tt;
        tt = number.get(7);

        System.out.println("the element at index 7 is " + tt);

        number.forEach(v -> System.out.println(v));


        ArrayList<String> mushroom = new ArrayList<>();
        mushroom.add ("Portobello");
        mushroom.add ("Cremini");
        mushroom.add ("Porcini");
        mushroom.add ("Shiitake");
        mushroom.add ("Morel");

        System.out.println (mushroom);

        mushroom.set(3, "Maitake");
        System.out.println (mushroom);

        mushroom.remove(2);
        System.out.println (mushroom);

        mushroom.forEach(System.out::println);


    }

}
