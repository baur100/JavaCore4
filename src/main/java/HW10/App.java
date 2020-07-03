package HW10;

//1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method). each class has at least 2 constructors (default and full)
//Create printClass()/ printInfo() method to print out all fields are private. Each field has getter and setter
// 2. In the App class create main() and create 2 instanses of each class; one instance created used default constructor - fill up fields using setter
//second object created using full constructor, print object info using print-out method


public class App {

    public static void main(String[] args) {

        Human man = new Human("Mike", "Male", 22);
        Human woman = new Human("Linda", "Female", 25);

        Animal cat = new Animal("Bob", "blue", 5);
        Animal dog = new Animal("Lu", "frenchie", 7);

        Device phone = new Device("Samsung", "Galaxy S9", "blue");
        phone.printOut();

        Device laptop = new Device("Ihone", "10", "Silver");
        laptop.printOut();

        Clothes dress = new Clothes("Zara", "Dress", 30);
        dress.printOut();


    }
}
