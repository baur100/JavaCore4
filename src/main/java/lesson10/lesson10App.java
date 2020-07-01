package lesson10;

public class lesson10App {
    public static void main(String[] args) {

        //The is not a default constoctor
        Person peter = new Person("peter", "pan", 1990);

        peter.printInfo();

        //The following is default constructor
        Person anna = new Person();
        anna.lastName ="Test";
        anna.name="Anna";
        anna.year=1990;

        Pet kitty = new Pet("Cat", "Kitty", 2);
        //adding a setter, b/c there is not direct access to the field
        kitty.setAge(-3);
        System.out.println(kitty.getAge());



    }
//    Person peter = new Person();
//    peter.year = "peter";





}
