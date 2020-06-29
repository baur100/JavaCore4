package hw8;

public class CellPhone {
    public String type;
    public String model;
    public String color;

    public void call(){
        System.out.println(type + " " + model + " is calling.");
    }

    public void turnOn(){
        System.out.println(type + " " + model + " is turned on.");
    }
}
