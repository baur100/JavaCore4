package HW14;

import java.util.ArrayList;
import java.util.List;

//Create 3 ArrayList - String, Integer and some Custom class. Add 4+ elements to each List. Excersize methods add/set/remove/get/foreach and etc

public class App {

    public static void main(String[] args) {

//1
        ArrayList<String> food = new ArrayList<String>();
        food.add("Chocolate");
        food.add("Meat");
        food.add("Vegetables");
        food.add("Fruits");
        System.out.println(food.size());
        food.set(2,"Cookies");
        food.remove("Fruits");
        food.forEach(x -> System.out.println(x));
        food.add("Pasta");
        System.out.println(food);


//2
        ArrayList<Integer> age = new ArrayList<Integer>();
        age.add(67);
        age.add(27);
        age.add(19);
        age.add(28);
        System.out.println(age.size());
        age.set(2,7);
        age.remove(2);
        age.forEach(x -> System.out.println(x));
        age.add(3);
        System.out.println(age);

//3
       ArrayList<Double> nums = new ArrayList<Double>();
       nums.add(22.4);
       nums.add(8.4);
       nums.add(92.3);
       nums.add(93.3);
        System.out.println(nums.size());
        nums.set(2,1.7);
        nums.remove(1);
        nums.forEach(x -> System.out.println(x));
        nums.add(4.6);
        System.out.println(nums);

        }
}