package HW14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(19);
        numbers.add(20);
        numbers.add(0);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("***********");

        numbers.add(0, 7);
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("***********");

        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("***********");

        numbers.set(4, 2);
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("***********");

        System.out.println(numbers.contains(19));

        System.out.println("***********");

        for (Integer v:numbers){
            System.out.println(v);
        }

        System.out.println("***********");

        for (int i = 0; i <numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("***********");

        numbers.forEach(v-> System.out.println(v));

    }
}
