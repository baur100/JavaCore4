package hw12;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[]args){
        Vehicle vehicle = new Vehicle("Vehicle",4,"white",true);
        vehicle.printInfo();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Vehicle1");
        vehicle1.setColor("Black");
        vehicle1.setEngine(true);
        vehicle1.setWheels(4);
        vehicle1.printInfo();

        Bicycle bicycle = new Bicycle("Bicycle",2,"Green",false,"gear");
        bicycle.printInfo();
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setName("Bicycle1");
        bicycle1.setColor("Brown");
        bicycle1.setEngine(false);
        bicycle1.setWheels(2);
        bicycle1.setBicycleTransmission("gear");
        bicycle1.printInfo();

        Boat boat = new Boat("Boat",0,"White",true, "forked");
        boat.printInfo();
        Boat boat1 = new Boat();
        boat1.setName("Boat1");
        boat1.setColor("White");
        boat1.setEngine(true);
        boat1.setWheels(0);
        boat1.setAnchor("admiral");
        boat1.printInfo();

        Car car = new Car("Car",4,"Pink",true, "sedan");
        car.printInfo();
        Car car1 = new Car();
        car1.setName("Car1");
        car1.setColor("Red");
        car1.setEngine(true);
        car1.setTypeBody("hatchback");
        car1.setWheels(4);
        car1.printInfo();
    }
}
