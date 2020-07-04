//        Create 2 classes ++++++++++
//        Every class should contain at least one field - type of Array +++++++
//        And At least one field - Custom Type (so obvious you should create more classes)
//        create 2 objects of each class
//

package HM11;

public class App {
    public static void main(String[] args) {
        String[] carModel = {"IS250","IS300","IS350"};
        String[] motorcycleModel = {"YS479","UC8732","KE8473"};
        Engine myCarEngine = new Engine(3.0);
        Car myCar = new Car("Lexus",carModel,myCarEngine);
        Engine myMotorcycleEngine = new Engine(2.5);
        Motorcycle myMotorcycle = new Motorcycle("Honda",motorcycleModel,myMotorcycleEngine);
        myCar.printCar();
        myMotorcycle.printMotorcycle();
    }

}
