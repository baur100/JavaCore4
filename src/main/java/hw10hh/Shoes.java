package hw10hh;

public class Shoes {
    private String brand;
    private String type;
    private int price;

    public Shoes () {}

    public Shoes(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        if (price >= 1000) {
            System.out.println("This is too expensive!");
            this.price = price;
        } else {
            this.price = price;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("Brand: "+brand+
                "\nType: "+type+
                "\nPrice: $"+price);
    }

}
