package hw14;

import java.util.ArrayList;
import java.util.List;



public class mainApp {
    public static void main(String[] args) {



        System.out.println("----------names-----------");

        List<String> names = new ArrayList<String>();

        names.add("Bob");  names.add("Marlen"); names.add("Anna"); names.add("Arthur");

        names.set(3, "Marianna");
        names.remove("Anna");

        names.forEach(v-> System.out.println(v));



        System.out.println("----------numbers-----------");

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12); numbers.add(123); numbers.add(121);numbers.add(124);
        numbers.set(3,1111111);
        numbers.remove("12");
        numbers.remove(0);
        System.out.println(numbers.contains(123));

        numbers.forEach(v-> System.out.println(v));


        System.out.println("---------- models-----------");
        List<Cars> models = new ArrayList<Cars>();

        Cars toyota = new Cars("Toyota");
        Cars bmw = new Cars("BMW");
        Cars honda = new Cars("Honda");
        Cars mazda = new Cars("Mazda");


        models.add(toyota);  models.add(bmw); models.add(honda); models.add(mazda);

        models.set(0,honda);
        models.remove(1);
        models.remove(mazda);

        System.out.println(models.contains(honda));



        for(Cars v: models) {
           System.out.println(v.getModel());

        }
    }
}
