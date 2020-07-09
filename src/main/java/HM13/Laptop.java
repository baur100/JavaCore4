package HM13;

import java.util.Arrays;

public class Laptop implements Configuration {
    private String brand;
    private String model;
    private int price;

    public Laptop(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printLaptop() {
        System.out.println("Laptop: " +
                " \nBrand = '" + brand + '\'' +
                ", \nModel = '" + model + '\'' + ", \nPrice = '" + price + '\'');

        System.out.println("*******************************");
        System.out.println("My configuration: ");
    }

    @Override
    public void configutationStandart() {
        System.out.println(" CPU is i9 \n GPU is RTX100 \n RAM is 32GB");
    }
}
