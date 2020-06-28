package June27;
//for a Class Person
public class ClassWork9June27Oop {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Holmes";
        anna.year = 1995;
        anna.hello("Peter");
        //String, int, char, boolean
        //System.out.println(anna.lastName);

        Person peter = new Person();
        peter.name = "Peter";
        peter.lastName = "Jackson";
        peter.year = 1989;
        peter.hello("Anna");

        int x = 10;

        String str = new String();
        str = "Hello";
        System.out.println(str.replace("e","E"));
        System.out.println(str.toUpperCase());

        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.color = "Purple";
        myCar.model = "Prius;" +
                "Civic";
        myCar.owner = "Me";
        myCar.year = 2010;
        myCar.year = 2011;


        Car hisCar = new Car();
        hisCar.brand = "Honda";
        hisCar.color = "Red";
        hisCar.model = "Prius;" +
                "Civic";
        hisCar.owner = "Me";
        hisCar.year = 2015;

        myCar.beep();
        myCar.startEngine();

        System.out.println(hisCar.model);
        hisCar.model = "Duplicate Model";
    }
}
