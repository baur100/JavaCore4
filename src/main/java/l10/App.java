package l10;

public class App {
    public static void main(String[] args) {
        Person peter = new Person("Peter","Pan", 1998);
//        peter.year=1998;
//        peter.name="Peter";
//        peter.lastName="Pan";

        peter.printInfo();

        Person anna = new Person();
        anna.lastName="Seymur";
        anna.name="Anna";
        anna.year=1999;

        Person dylan = new Person("Dylan", "Anderson");

        String str = new String("Hello, World");

        Car mazda = new Car("Mazda", "CX-9","Jonatan",2015);
        Car johnson = new Car("Johnson");

        Pet kitty = new Pet("Cat","Kitty",2);
        System.out.println(kitty.getAge());
        kitty.setAge(3);
        System.out.println(kitty.getAge());
        kitty.setAge(-5);
        System.out.println(kitty.getAge());

    }
}
