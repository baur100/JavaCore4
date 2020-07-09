package HW14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <String> sweets = new ArrayList<>();
        sweets.add("Marshmallow");
        sweets.add("Chocolate");
        sweets.add("Waffles");
        sweets.add("Creme Brulee");
        System.out.println(sweets);
        System.out.println(sweets.size());

        System.out.println("***********");

        sweets.add(1, "Sguschenka");
        System.out.println(sweets);
        System.out.println(sweets.size());

        System.out.println("***********");

        sweets.remove(0);
        System.out.println(sweets);
        System.out.println(sweets.size());

        System.out.println("***********");

        sweets.set(3, "Croissant");
        System.out.println(sweets);
        System.out.println(sweets.size());

        System.out.println("***********");

        sweets.remove("Waffles");
        System.out.println(sweets);
        System.out.println(sweets.size());

        System.out.println("***********");

        System.out.println(sweets.contains("Chocolate"));

        System.out.println("***********");

        for (String v:sweets) {
            System.out.println(v);
        }

        System.out.println("***********");

        for (int i = 0; i <sweets.size(); i++){
            System.out.println(sweets.get(i));
        }

        System.out.println("***********");

        sweets.forEach(v-> System.out.println(v));
    }
}
