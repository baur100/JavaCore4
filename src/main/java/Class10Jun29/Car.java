package Class10Jun29;

public class Car {
    public String brand;
    public String model;
    public String owner;
    public int year;

//    Usage of this keyword
    public Car(String brand, String model, String owner, int year){
    // here, this.brand --> Class variable & brand --> parameter of the method
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.year = year;
    }
    public Car(String owner){
        this.owner = owner;
    }

    public Car(String brand, String model){
        this.brand = brand;
    }
}
