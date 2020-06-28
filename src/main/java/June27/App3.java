package June27;

public class App3 {
    public static void main(String[] args) {
        Fruit banana = new Fruit();
        banana.name="Banana";
        System.out.println(banana.name);

        Fruit xx = new Fruit();
        System.out.println(xx.name);

        xx=banana;
        System.out.println(xx.name);
        System.out.println(banana.name);
        xx.name="Incognito Fruit";
        System.out.println(xx.name);
        System.out.println(banana.name);
        banana.name = "Apple";
        System.out.println(xx.name);
        System.out.println(banana.name);


        int a = 10;
        int b=a;
        b=100;

        System.out.println(a);

    }
}
