package hw8;

public class Bike {
    public String brand;
    public String model;
    public String color;

    public void printIt(){
        System.out.println("brand = "+brand);
        System.out.println("model = "+model);
        System.out.println("color = "+color);

    }
    public void purchase(){
        System.out.println("I've purchased a new "+brand + " "+model+ " of the color " +color);
    }
}
