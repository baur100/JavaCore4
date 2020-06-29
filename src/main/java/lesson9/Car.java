package lesson9;

public class Car {
    public String brand;
    public String model;
    public String color;
    public String owner;
    public int year;

    public void beep(){
        System.out.println("Beeeeep");
    }
    public void startEngine(){
        System.out.println(brand +" "+model+ "Engine started");
    }
}
