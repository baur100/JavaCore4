package HW10;

public class Device {

    private String brand;
    private String model;
    private String color;


    public Device(String brand, String model, String color) {

        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Device() {

    }

    public void setName() {

        this.brand = brand;
    }

    public void setSex() {

        this.model = model;
    }

    public void setYear() {

        this.color = color;
    }

    public String getName() {

        return brand;

    }

    public String getSex() {

        return model;
    }

    public String getYear() {

        return color;

    }
    public void printOut() {

        System.out.println("Device= " + brand + "\nModel= " + model + "\nColor= " + color);
    }

}
