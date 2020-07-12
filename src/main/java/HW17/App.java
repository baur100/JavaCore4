package HW17;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> coffee = new HashMap<String,String>();
        coffee.put("Latte", "Small");
        coffee.put("Mocha", "Medium");
        coffee.put("Americano", "Large");
        coffee.put("Cappucino", "Small");
        System.out.println(coffee);
        System.out.println("----------replace-----------");
        coffee.replace("Cappucino", "Large");
        System.out.println(coffee);
        System.out.println("------------get-------------");
        String index = coffee.get("Mocha");
        System.out.println(index);
        System.out.println("---------------------------");

        Map<Integer,String> month = new HashMap<Integer,String>();
        month.put(01, "January");
        month.put(02, "February");
        month.put(03, "March");
        month.put(04, "April");

        System.out.println(month);
        System.out.println("----------remove-----------");
        month.remove(03);
        System.out.println(month);
        System.out.println("---------------------------");

        Map<Country,President> country= new HashMap<Country,President>();
        country.put(new Country("Russia", "Moscow"), new President("Vladimir"));
        country.put(new Country("Belgium", "Brussels"), new President("Philippe"));
        country.put(new Country("Austria", "Vienna"), new President("Alexander Van der Bellen"));
        country.put(new Country("Poland", "Warsaw"), new President("Andrzej Duda"));

        for (Country key: country.keySet()) {
            System.out.println(key.getCapital());
        }



    }
}
