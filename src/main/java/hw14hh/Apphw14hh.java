package hw14hh;

import java.util.ArrayList;
import java.util.List;

public class Apphw14hh {
    public static void main(String[] args) {
        List<String> sports = new ArrayList<String>();

        sports.add("Baseball");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Soccer");
        System.out.println(sports);

        sports.set(1, "Lacrosse");
        System.out.println(sports);

        System.out.println("**************************************");

        List<Integer> age = new ArrayList<Integer>();

        age.add(20);
        age.add(13);
        age.add(55);
        age.add(46);
        age.add(78);
        System.out.println(age);

        age.remove(3);
        for(int i = 0; i < age.size(); i++) {
            System.out.println(age.get(i));
        }

        System.out.println("**************************************");

        List<Store> myStores = new ArrayList<Store>();

        Store gap = new Store("Clothing", "Gap");

        myStores.add(gap);
        System.out.println(gap.getName());

        System.out.println("**************************************");

        Store wholeFoods = new Store("Grocery", "Whole Foods");
        myStores.add(wholeFoods);
        for (Store v: myStores) {
            System.out.println(v.getType());
        }

        System.out.println("**************************************");

        Store ebay = new Store("Online", "eBay");
        myStores.add(ebay);
        myStores.forEach(v-> System.out.println(v.toString()));

        System.out.println("**************************************");

        Store bestBuy = new Store("Electronic", "Best Buy");
        System.out.println(myStores.contains(ebay));
        System.out.println(myStores.contains(bestBuy));


    }
}
