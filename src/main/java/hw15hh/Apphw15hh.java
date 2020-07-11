package hw15hh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apphw15hh {
    public static void main(String[] args) {
        Map<String, String> brands = new HashMap<>();
        brands.put("Soda", "Pepsi");
        brands.put("Cellphone", "Motorola");
        brands.put("Perfume", "Chanel");
        brands.put("Clothing", "Rocaware");

        System.out.println(brands);

        brands.replace("Soda", "Coke");
        System.out.println(brands);
        System.out.println(brands.get("Perfume"));
        System.out.println(brands.size());

        for(String key: brands.keySet()) {
            System.out.println(key);
        }

        System.out.println("********************************************");

        Map<Integer, String> toDoList = new HashMap<>();
        toDoList.put(1, "Wash Dishes");
        toDoList.put(2, "Mow The Lawn");
        toDoList.put(3, "Mail Package");
        toDoList.put(4, "Pickup Dry Cleaning");

        System.out.println(toDoList);

        toDoList.remove(4);
        System.out.println(toDoList);

        for(String value: toDoList.values()) {
            System.out.println(value);
        }

        System.out.println(toDoList.size());

        System.out.println("********************************************");

        Map<City, Mayor> cityMayorMap = new HashMap<>();
        City nyc = new City("New York City", 8.5);
        Mayor nycMayor = new Mayor("Bill DeBlasio");

        City lax = new City("Los Angeles", 4.0);
        Mayor laxMayor = new Mayor("Eric Garcetti");

        City atl = new City("Atlanta", 0.5);
        Mayor atlMayor = new Mayor("Keisha Lance Bottoms");

        City sea = new City("Seattle", 0.7);
        Mayor seaMayor = new Mayor("Jenny Durkan");

        cityMayorMap.put(nyc, nycMayor);
        cityMayorMap.put(lax, laxMayor);
        cityMayorMap.put(atl, atlMayor);
        cityMayorMap.put(sea, seaMayor);

        System.out.println(cityMayorMap);

        for(Map.Entry<City, Mayor> pair : cityMayorMap.entrySet()) {
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }

        System.out.println("********************************************");

        List<ShirtSize> childSize = new ArrayList<>();
        childSize.add(ShirtSize.YOUTH);
        childSize.add(ShirtSize.XS);
        childSize.add(ShirtSize.S);

        List<Design> childrenDesign = new ArrayList<>();
        childrenDesign.add(Design.POKEMON);
        childrenDesign.add(Design.FLINTSTONES);
        childrenDesign.add(Design.SHREK);
        childrenDesign.add(Design.KIRBY);

        Shirt childShirt = new Shirt(ShirtType.TSHIRT, "Red", childrenDesign, childSize);
        System.out.println(childShirt);

        System.out.println("********************************************");

        List<Design> adultDesign = new ArrayList<>();
        adultDesign.add(Design.GOT);
        adultDesign.add(Design.GODFATHER);
        adultDesign.add(Design.FRIENDS);
        adultDesign.add(Design.AVENGERS);

        List<ShirtSize> adultSize = new ArrayList<>();
        adultSize.add(ShirtSize.M);
        adultSize.add(ShirtSize.L);
        adultSize.add(ShirtSize.XL);
        adultSize.add(ShirtSize.XXL);

        Shirt adultShirt = new Shirt(ShirtType.HOODIE, "Black", adultDesign, adultSize);
        System.out.println(adultShirt);
    }
}
