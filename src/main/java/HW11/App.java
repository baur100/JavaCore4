package HW11;

/*1. Create 4 classes with 3 fields) and methods (at least 1 method).Each class has at least 2 constructors (default and full)
     Create printClass()/ printInfo() method to print out all fields. Fields are private. Each field has getter and setter
2. In the App class create main() and create 2 instanses of each class; one instance created used default constructor - fill up
 fields using setter. Second object created using full constructor. Print object info using print-out method */

public class App {

    public static void main(String[] args) {

//1.Device
        Device phone = new Device("Phone", "Samsung", "Silver");

        Device laptop = new Device();
        laptop.setBrand("Razer");
        laptop.setColor("Blade 15");
        laptop.setColor("Black");

        phone.printDevice();
        laptop.printDevice();

//2.City
        City myCity = new City("New York", "Brown", 12);

        City thatCity = new City();
        thatCity.setCityName("Moscow");
        thatCity.setStreet("Ryleeva");
        thatCity.setBuildingNumber(25);

        myCity.printCity();
        thatCity.printCity();

//3.Food
        Food fruit = new Food("Banana", "Yellow", 1);

        Food vegetable = new Food();
        vegetable.setItem("Cucumber");
        vegetable.setColor("Green");
        vegetable.setPrice(2);

        fruit.printMe();
        vegetable.printMe();

//4. Movie

       Movie movie1 = new Movie("Black Swan", "Drama", 2);

       Movie movie2 = new Movie();
       movie2.setName("Truman Show");
       movie2.setGenre("Comedy");
       movie2.setHowLong(3);

    }
}
