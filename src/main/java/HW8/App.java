package HW8;

public class App {
    public static void main(String[] args) {


        Girl girl = new Girl();
        girl.name = "Veronica";
        girl.age = 22;
        girl.hairColor = "brown";

        girl.sayHello();

        Device phone = new Device();
        phone.brand = "Samsung";
        phone.model = "S9+";
        phone.color = "Silver";
        phone.price = 1000;

        phone.myPhone();


        Car car = new Car();
        car.brand = "BMW";
        car.model = "i8";
        car.color = "Red";

        car.myCar();

       Dog dog = new Dog();
       dog.name = "Lola";
       dog.owner = "Victoria";
       dog.age = 3;

       dog.printMe();

    }
}
