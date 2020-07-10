package Homework14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car audi = new Car("Audi");
        Car bmw = new Car("BMW");
        Car mercedes = new Car("Mercedes Benz");
        Car lexus = new Car("Lexus");

        cars.add(audi);
        cars.add(bmw);
        cars.add(mercedes);
        cars.add(lexus);
        cars.forEach(v-> System.out.println(v.getBrand()));

        System.out.println("*********************************");

        cars.set(1,mercedes);
        cars.forEach(v-> System.out.println(v.getBrand()));

        System.out.println("*********************************");

        cars.remove(mercedes);
        cars.forEach(v-> System.out.println(v.getBrand()));

        System.out.println("*********************************");

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        System.out.println(animals);

        animals.remove("Dog");
        System.out.println(animals);
        System.out.println(animals.get(2));
        animals.forEach(System.out::println);
        animals.set(2,"Dog");
        System.out.println(animals);

        System.out.println("*********************************");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);

        numbers.remove(3);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        numbers.forEach(v-> System.out.println(v));
        numbers.set(2,5);
        System.out.println(numbers);
    }
}
