package hw14;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("U");
        System.out.println(list.size());

        list.add("I");
        System.out.println(list.size());

        list.add("J");
        System.out.println(list.size());
        System.out.println(list);

        list.add(0,"K");
        System.out.println(list);

        System.out.println(list.get(2));

        //list.remove(3);
        //list.remove("U");
        //list.set(0, "M");

        System.out.println(list.contains("I"));

        int xx =5;
        Integer uu = 4;


    }
}
