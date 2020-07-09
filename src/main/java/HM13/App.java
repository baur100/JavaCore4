//        Create an interface and 2 classes which implements it
//        Create 2 objects of each class
//        Assign one object to interface type


package HM13;

public class App {
    public static void main(String[] args) {
        Laptop dell = new Laptop("Dell", "IYR350", 1200);
        ManufactorAddress chine = new ManufactorAddress("1240 Fuho st", "Tumpiro", "China");
        dell.printLaptop();
        dell.configutationStandart();
        System.out.println("***************************************");
        chine.printAddress();

    }
}
