//        Create 2 classes ++++++++++
//        Every class should contain at least one field - type of Array +++++++
//        And At least one field - Custom Type (so obvious you should create more classes)
//        create 2 objects of each class
//

package HM11;

public class App {
    public static void main(String[] args) {
        Engine car = new Engine(3);
        String[] subjs = {"IS250","IS300","IS350"};
        Car Lexus = new Car("Lexus",subjs,car );
        Lexus.printInfo();
    }
}
