package hw8;

public class Laptop {
    public String brand;
    public String model;
    public double size;

    public void printIt(){
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("size = " + size);

    }
    public void specification(){
        System.out.println("I am selling my " +brand + " ,model " +model+ " of hard disk size of gb " +size);
    }

}
