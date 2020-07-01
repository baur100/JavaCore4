package l9;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Holmes";
        anna.year=1995;

        anna.hello("Peter");

        // String, int, char, boolean

//        System.out.println(anna.lastName);

        Person peter = new Person();
        peter.name="Peter";
        peter.lastName="Jackson";
        peter.year=1989;

        peter.hello("Anna");

        int xx=10;
        String str = new String();
        str="Hello";
        System.out.println(str.replace("e","E"));
        int[] arr = new int[5];
        Car myCar = new Car();
        myCar.brand="Toyota";
        myCar.color="Purple";
        myCar.model="Prius";
        myCar.owner="Me";
        myCar.year=2010;

        myCar.year=2011;

        Car hondaCivicOfMyFriendVictor = new Car();
        hondaCivicOfMyFriendVictor.brand="Honda";

        myCar.beep();
        myCar.startEngine();

    }
}
