package HW15;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String, String> toDoList = new HashMap<String, String >();
        toDoList.put("Shopping", "Saturday");
        toDoList.put("Yoga", "Tuesday");
        toDoList.put("Walking", "Monday");
        toDoList.put("Clubbing", "Friday");

        System.out.println(toDoList);
        System.out.println(toDoList.get ("Yoga"));

        System.out.println("**********");

        toDoList.put("Walking", "Thursday");
        System.out.println(toDoList);
        System.out.println(toDoList.size());

        System.out.println("**********");

        toDoList.replace("Yoga", "Wednesday");
        System.out.println(toDoList);
        System.out.println(toDoList.get ("Yoga"));

        System.out.println("**********");

        toDoList.remove("Clubbing");

        System.out.println(toDoList);
        System.out.println(toDoList.size());

        System.out.println("**********");

        for (String key: toDoList.keySet()) {
            System.out.println(key);
        }

        System.out.println("**********");

        for (String value:toDoList.values()) {
            System.out.println(value);
        }

        System.out.println("**********");

        for (Map.Entry<String, String> pair:toDoList.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

    }
}
