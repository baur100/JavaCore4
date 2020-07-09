package l14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.size());

        list.add("Green");
        System.out.println(list.size());

        list.add("Watermelon");
        System.out.println(list.size());

        System.out.println(list);
        list.add("Water");
        list.add("Sun");
        list.add("Paper");
        System.out.println(list);
        list.add(0,"Car");
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);
        list.remove("Sun");
        System.out.println(list);
        System.out.println(list.size());
        list.set(0,"Oak");
        System.out.println(list);
        System.out.println(list.contains("Oak"));
        System.out.println(list.contains("OAK"));
        list.add("Water");
        System.out.println(list);
        list.remove("Water");
        System.out.println(list);

        List<Integer> places = Arrays.asList(1,1,2,6,1,2,3);

        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Grey");

        for (int i = 0; i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        for(String v : colors) {
            System.out.println(v);
        }

        list.forEach(v-> System.out.println(v));

//        list.forEach(System.out::println);

        System.out.println(colors);

//        list.set(99,"FFFFF");

        List<Person> people = new ArrayList<Person>();

        Person anna = new Person("Anna");
        Person peter = new Person("Peter");
        Person anna1 = new Person("Anna");

        people.add(anna);
        people.add(peter);

        people.forEach(v-> System.out.println(v.getName()));

        for(Person p : people){
            System.out.println(p.getName());
        }

        System.out.println(people.contains(anna1));
    }
}
