package HW16;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<String>();
        ArrayList<Integer> amounts=new ArrayList<Integer>();
        ArrayList<Stores>store=new ArrayList<Stores>();


        System.out.println("\n************************************");
        //Add elements to the ArrayList of strings
        words.add("Friendship");
        words.add("Respect");
        words.add("Kindness");
        words.add(0,"Freedom");
        System.out.println(words);

        //Print the 3rd element
        System.out.println("\nThe third element is: ");
        System.out.println(words.get(2));

        //Remove the first element
        words.remove(0);
        System.out.println("\nAfter removing the first element, here is what we have now: ");
        System.out.println(words);

        //Replace the third element by another word
        words.set(2, "Courage");
        System.out.println("\nAfter replacing the third element, here is what we have now: ");
        System.out.println(words);

        //Check if the word "Friendship" is present here
        System.out.println("\nIs the word \"Friendship\" here?" );
        System.out.println(words.contains("Friendship"));

        //Display all the elements in the ArrayList
        System.out.println("\nHere are the remaining elements");
        for(String v:words){
            System.out.println(v);
        }


        System.out.println("\n************************************");
        amounts.add(10);
        amounts.add(20);
        amounts.add(30);
        amounts.add(40);
        System.out.println(amounts);

        //Print the 3rd element
        System.out.println("\nThe third element is: ");
        System.out.println(amounts.get(2));

        //Remove the first element
        amounts.remove(0);
        System.out.println("\nAfter removing the first element, here is what we have now: ");
        System.out.println(amounts);

        //Replace the third element by another word
        amounts.set(2, 100);
        System.out.println("\nAfter replacing the third element, here is what we have now: ");
        System.out.println(amounts);

        //Check if the number 100 is present here
        System.out.println("\nIs the number \"100\" here?" );
        System.out.println(amounts.contains(100));

        //Display all the elements in the ArrayList
        System.out.println("\nHere are the remaining elements");
        amounts.forEach(x-> System.out.println(x));

        System.out.println("\n************************************");
        //Add elements to the ArrayList of strings
        Stores vons=new Stores("Vons");
        Stores traderjoes= new Stores("Trader Joe's");
        Stores ralphs=new Stores("Ralph's");
        Stores sprouts= new Stores("Sprouts");

        store.add(vons);
        store.add(traderjoes);
        store.add(ralphs);
        store.add(sprouts);
        store.forEach(v-> System.out.println(v.getStorename()));

        //Print the 3rd element
        System.out.println("\nThe third element is: ");
        System.out.println(store.get(2).getStorename());

        //Remove the first element
        store.remove(0);
        System.out.println("\nAfter removing the first element, here is what we have now: ");
        store.forEach(v-> System.out.println(v.getStorename()));

        //Replace the third element by another word
        Stores macys=new Stores("Macy's");
        store.set(2,macys );
        System.out.println("\nAfter replacing the third element, here is what we have now: ");
        store.forEach(v-> System.out.println(v.getStorename()));

        //Check if the store Nordstrom is present here
        Stores nordstrom= new Stores("Nordstrom");
        System.out.println("\nIs the store \"Nordstrom\" here?" );
        System.out.println(store.contains(nordstrom));

        //Display all the elements in the ArrayList
        System.out.println("\nHere are the remaining elements");
        store.forEach(v-> System.out.println(v.getStorename()));

        System.out.println("\n************************************");



    }
}
