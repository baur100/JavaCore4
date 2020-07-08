package Homework15;

public class Clock implements Battery{
    private String brand;
    private String model;
    private int diameter;

    public Clock(String brand, String model, int diameter) {
        this.brand = brand;
        this.model = model;
        this.diameter = diameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void BatteryStandard() {
        System.out.println("I implement battery standards to operate Wall Clock");
    }
}
