package Homework10;

public class Laptops {
    private String brand;
    private String model;
    private String color;

    public Laptops(){}

    public Laptops(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public void printInfo(){
        System.out.println("Brand = "+brand);
        System.out.println("Model = "+model);
        System.out.println("Color = "+color);
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public String getModel(){
        return this.model;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public String getColor(){
        return this.color;
    }
}
