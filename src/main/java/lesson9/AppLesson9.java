package lesson9;

public class AppLesson9 {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Holmes";
        anna.year = 1995;

        anna.hello("Peter");

        System.out.println(anna.lastName);

        Person peter = new Person();
        peter.name = "Peter";
        peter.lastName = "Jackson";
        peter.year=1989;

        peter.hello("Anna");

        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.color = "Black";
        myCar.model = "Solora";
        myCar.owner = "Me";
        myCar.year = 2002;

        Car hondaCivicOfMyFriend = new Car();
        hondaCivicOfMyFriend.brand = "Honda";

        myCar.beep();
        myCar.startEngine();


    }
}
