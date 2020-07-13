package hw15;

import l15Enums.Size;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        System.out.println("-----------------------cars-----------------------");

        HashMap<String, String> cars = new HashMap<>();
        cars.put("Honda", "Civic");
        cars.put("BMW", "X5");
        cars.put("Audi", "A5");
        cars.put("Mersedes", "S");

        System.out.println(cars);

        cars.put("Mazda", "Next");
        cars.replace("Audi", "X10");
        cars.remove("Mersedes", "S");
        System.out.println(cars.get("Honda"));
        //cars.forEach();

        System.out.println(cars);

        for(String key: cars.keySet()){
            System.out.println(key);
        }
        for(String value : cars.values()){
            System.out.println(value);
        }


        for(Map.Entry<String,String> pair : cars.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }


        System.out.println("-----------------------numbers-----------------------");


        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(2,3);
        numbers.put(4,56);
        numbers.put(45,78);
        numbers.put(33,22);

        System.out.println(numbers);

        numbers.put(0,222);
        numbers.replace(2,333333);
        numbers.remove(45,78);
        System.out.println(numbers.get(2));


        System.out.println(numbers);

        for(Integer key: numbers.keySet()){
            System.out.println(key);
        }
        for(Integer value : numbers.values()){
            System.out.println(value);
        }

        for(Map.Entry<Integer, Integer> pair : numbers.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }


        System.out.println("-----------------------person-----------------------");

        HashMap<String, Integer> person = new HashMap<>();
        person.put("Andy", 23);
        person.put("Arthur", 34);
        person.put("Ana", 31);
        person.put("Beta", 45);

        System.out.println(person);

        person.put("Bob", 22);
        person.replace("Beta", 87);
        person.remove("Ana", 31);
        System.out.println(person.get("Bob"));

        for(String key: person.keySet()){
            System.out.println(key);
        }
        for(Integer value: person.values()){
            System.out.println(value);
        }

        for(Map.Entry<String,Integer> pair : person.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        System.out.println("--------------Enums------------Enums-----------");
        List<Color> colors = new ArrayList<Color>();
        colors.add(Color.BROWN);
        colors.add(Color.GREEN);

        

        System.out.println(colors);


        List<Model> models = new ArrayList<Model>();
        models.add(Model.BETA);
        models.add(Model.PREMIUM);

        System.out.println(models);

    }


}
