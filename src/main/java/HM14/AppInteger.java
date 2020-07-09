package HM14;

import java.util.ArrayList;

public class AppInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);
        System.out.println("********************************************");
        numbers.remove(1);
        numbers.remove(2);
        numbers.remove(3);
        System.out.println(numbers);
        System.out.println("********************************************");
        numbers.set(1,3);
        numbers.set(2,4);
        System.out.println(numbers);
        System.out.println("********************************************");
       Integer element = numbers.get(2);
        System.out.println(element);
        System.out.println("********************************************");
        for (Integer v:numbers){
            System.out.println(v);
        }
        System.out.println("********************************************");
        numbers.forEach(v-> System.out.println(v));
        System.out.println("********************************************");
        numbers.forEach(System.out::println);
                System.out.println("********************************************");
        for (int i = 0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
    }
}

