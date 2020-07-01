package Class10Jun29;

public class Class10June29 {
    public static void main(String[] args) {
        Person peter = new Person("Peter","Pan",1998);

/*
        peter.year=1998;
        peter.firstName="Peter";
        peter.lastName="Pan";
*/

        peter.printInfo();

        Person anna = new Person();
        anna.firstName = "Anna";
        anna.lastName = "Seymur";
        anna.year = 1999;

        Person dylan = new Person("dylan","Anderson");

        String str = new String("Hello, World!");

        Car mazda = new Car("Mazda", "CX-9","Jonatan",1999);
        Car johnson = new Car("johnson");

        Pet kitty = new Pet("Cat", "Kitty", 2);
        kitty.setAge(3);
        System.out.println("The Age of "+kitty.getName()+" is "+kitty.getAge());
        kitty.setAge(-5);
        System.out.println("The Age of "+kitty.getName()+" is "+kitty.getAge());


    }
}
