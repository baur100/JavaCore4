package HW11;

public class Device {

    private String type;
    private String brand;
    private String color;

    public Device(String type, String brand, String color) {

        this.type = type;
        this.brand = brand;
        this.color = color;

    }

    public Device() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDevice() {

        System.out.println("Device= " + type + "\nBrand= " + brand + "\nColor= " + color);

    }
}
