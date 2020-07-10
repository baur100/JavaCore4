package hw13InterfacePolymerphism;

public class Rose implements FlowerBox {
    public String brand;
    public String country;
    public String color;
    public int quantity;
    public int price;

    public Rose(String brand, String country, String color, int quantity, int price) {
        this.brand = brand;
        this.country = country;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void FlowerBoxNote() {
        System.out.println("Rosses With Love");
    }

    @Override
    public void FlowerBoxSize() {
        System.out.println("25 beautiful flowers");
    }

}




