package HW15;

public class App {
    public static void main(String[] args) {

        System.out.println("\n**************************************************");

        //Truck 1
        Truck van = new Truck(1, "Tahoe", 120000);
        van.emptyFirstOil();
        van.addNewOil();

        System.out.println("\n**************************************************");

        //Truck 2

        Oilchange tractor = new Truck(2, "Caterpillar", 250000);
        tractor.emptyFirstOil();
        tractor.addNewOil();

        System.out.println("\n**************************************************");

        //Motorcvcle 1
        Motorcycle scooter = new Motorcycle(100, "Harley Davidson", 5000);
        scooter.emptyFirstOil();
        scooter.addNewOil();

        System.out.println("\n**************************************************");

        //Motorcycle 2

        Oilchange cruiser = new Motorcycle(150, "Yamaha", 10000);
        cruiser.emptyFirstOil();
        cruiser.addNewOil();

        System.out.println("\n**************************************************");


    }

}
