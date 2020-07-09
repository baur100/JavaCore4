//      Create 3 ArrayList - String, Integer and some Custom class
//      Add 4+ elements to each List
//      excersize methods add/set/remove/get/foreach and etc


        package HM14;

import java.util.ArrayList;

public class AppString {
    public static void main(String[] args) {
        ArrayList<String> carBrand = new ArrayList<String>();
        carBrand.add("Lexus");
        carBrand.add("Volvo");
        carBrand.add("Mercedes");
        carBrand.add("BMW");
        carBrand.add("Audi");
        carBrand.add("Jaguar");
        System.out.println(carBrand);
        System.out.println("********************************************");
        carBrand.remove(1);
        carBrand.remove(2);
        carBrand.remove("Audi");
        System.out.println(carBrand);
        System.out.println("********************************************");
        carBrand.set(1,"Maserati");
        carBrand.set(2,"Lamborghini");
        System.out.println(carBrand);
        System.out.println("********************************************");
        String element = carBrand.get(2);
        System.out.println(element);
        System.out.println("********************************************");
        for (String v:carBrand){
            System.out.println(v);
        }
        System.out.println("********************************************");
        carBrand.forEach(v-> System.out.println(v));
        System.out.println("********************************************");
        carBrand.forEach(System.out::println);
        System.out.println("********************************************");
        for (int i = 0; i<carBrand.size();i++){
            System.out.println(carBrand.get(i));
        }
    }
    }
