package l9;

public class App3 {
    public static void main(String[] args) {

        Fruit banana = new Fruit();
        banana.name="Banana";
        Fruit xx = new Fruit();
        xx=banana;
        xx.name="Incognito Fruit";
        System.out.println(banana.name);

        int a=10;
        int b=a;
        b=100;

        System.out.println(a);
    }
}
