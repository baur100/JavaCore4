package l10;

public class Car {
    public String brand;
    public String model;
    public String owner;
    public int year;

    public Car(String brand, String model, String owner, int year){
        this.brand=brand;
        this.model=model;
        this.owner=owner;
        this.year=year;
    }
    public Car(String owner){
        this.owner=owner;
    }
//    public Car(String brand){
//        this.brand=brand;
//    }

}
