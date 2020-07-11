package HW15;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {
        Map<Integer, String> groceryList = new HashMap<Integer, String >();
        groceryList.put(0, "Greek yogurt");
        groceryList.put(1, "French baguette");
        groceryList.put(2, "Lamb leg");
        groceryList.put(3, "Seasoning");
        groceryList.put(4, "Oat milk");

        System.out.println(groceryList);

        System.out.println("**********");

        System.out.println(groceryList.get(2));
        System.out.println(groceryList.size());

        System.out.println("**********");

        groceryList.replace(1, "Bologna");
        System.out.println(groceryList);

        System.out.println("**********");

        groceryList.remove(2);
        System.out.println(groceryList);

        System.out.println("**********");

        groceryList.put(2, "Cheddar");
        System.out.println(groceryList);

        System.out.println("**********");

        for (Integer key:groceryList.keySet()) {
            System.out.println(key);
        }

        System.out.println("**********");

        for (String value:groceryList.values()) {
            System.out.println(value);
        }

        System.out.println("**********");

        for (Map.Entry<Integer, String>pair:groceryList.entrySet()) {
            System.out.println(pair.getKey() + ") " + pair.getValue());
        }

    }
}
