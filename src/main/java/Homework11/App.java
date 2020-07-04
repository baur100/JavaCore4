package Homework11;

public class App {
    public static void main(String[] args) {
        String[] teaFlavor = {"Peach", "Strawberry", "Grapefruit", "Mango"};
        Tea green = new Tea("Green Tea", teaFlavor);

        String[] arr = green.getFlavor();
        for (String v : arr) {
            System.out.println(v);
            System.out.println(green.getType());
        }

        System.out.println("**************************");

        Tea black = new Tea("Black Tea", teaFlavor);

        String[] array = black.getFlavor();
        for (String y : array) {
            System.out.println(y);
            System.out.println(black.getType());
        }

        System.out.println("**************************");

        String[] type = {"Americano", "Espresso", "Latte", "Mocha"};
        Coffee robusta = new Coffee("Robusta", type, true);

        String[] ar = robusta.getCoffeeType();
        for (String x : ar) {
            System.out.println(x);
            System.out.println(robusta.getBean());
        }

        System.out.println("**************************");

        Coffee arabica = new Coffee("Arabica", type, false);

        String[] a = arabica.getCoffeeType();
        for (String z : a) {
            System.out.println(z);
            System.out.println(arabica.getBean());

        }

        System.out.println("**************************");

        Caffeine caff = new Caffeine(true);
        caff.printCaffeine();
    }
}
