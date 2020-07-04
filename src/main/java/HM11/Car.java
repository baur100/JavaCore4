package HM11;

public class Car {
    private String brand;
    private String[] model;
    Engine engineSize;

    public Car(String brand, String[] model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engineSize = engine;
    }
public void printInfo(){
    System.out.println("Brand is =" + brand);
    System.out.println("Model is =" + model);
    engineSize.printEngine();
}
}
