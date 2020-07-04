package HM11;

import java.util.Arrays;

public class Car {
    private String brand;
    private String[] carModel;
    private Engine engine;

    public Car(String brand, String[] model, Engine engine) {
        this.brand = brand;
        this.carModel = model;
        this.engine = engine;
    }

    public void printCar() {
        System.out.println("Car " +
                "Brand= '" + brand + '\'' +
                ", Model=" + Arrays.toString(carModel));
        this.engine.printEngine();
    }
}
