package hw9Object;

public class App {
    public static void main(String[] args) {

//        Person
        Person oliver = new Person();
        oliver.name = "Oliver";
        oliver.lastName = "Johns";
        oliver.year = 1973;

        Person kate = new Person();
        kate.friendsName = "Kate";
        kate.friendsLastName = "Lewis";
        kate.friendsYaer = 1975;

        System.out.println(oliver.lastName);
        System.out.println(kate.friendsLastName);


        kate.friendship();
        kate.frienAndFriend();



//        Dog
        Dog myDog = new Dog();
        myDog.breed = "Frenchie";
        myDog.color = "black";
        myDog.name = "Gera";

        Dog friendsDog = new Dog();
        friendsDog.friendsBreed = "Pitbull";
        friendsDog.friendsName = "Lucy";

        System.out.println(myDog.breed);
        System.out.println(friendsDog.friendsBreed);

        myDog.woofWoof();

//        TV
        TV newTV = new TV();
        newTV.brand = "Sharp";
        newTV.year = 2018;

        TV TV2 = new TV();
        TV2.newBrand = "Samsung";
        TV2.newYear = 2020;

        System.out.println(newTV.brand);
        System.out.println(TV2.newYear);


//         Car
        Car car1 = new Car();
        car1.brand = "Nissan";
        car1.model = "Murano";
        car1.year = 2017;

        Car car2 = new Car ();
        car2.carBrand2 = "Toyota";
        car2.carModel2 = "Prius";
        car2.carYeaar2 = 2019;

        System.out.println(car1.model);
        System.out.println(car2.carModel2);

       car1.motor();
       car1.click();

    }
}


