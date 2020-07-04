package HM11;

import java.util.Arrays;

public class Motorcycle {
    private String brand;
    private String[] motorcycleModel;
    Engine engine;

    public Motorcycle(String brand, String[] model, Engine size) {
        this.brand = brand;
        this.motorcycleModel = model;
        this.engine = size;
    }
    public void printMotorcycle() {
        System.out.println("Motorcycle " +
                "brand= '" + brand + '\'' +
                ", model=" + Arrays.toString(motorcycleModel));
        this.engine.printEngine();
    }
}
