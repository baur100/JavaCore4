package Hw15;

public class Car {
    private String make;
    private String model;
    private Color color;
    private int year;

    public Car(String make, String model, Color color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public void printCar() {
        System.out.println("Car make " + make + " model " + " color " + color + " " + year);
    }

}

