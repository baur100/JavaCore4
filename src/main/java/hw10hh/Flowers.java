package hw10hh;

public class Flowers {
    private String type;
    private String color;
    private String season;
    private int price;

    public Flowers() {}

    public Flowers(String type, String color, String season, int price) {
        this.type = type;
        this.color = color;
        this.season = season;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("This flower is FREE!");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("Flower Name = "+type+
                "\nColor = "+color+
                "\nSeason = "+season+
                "\nPrice = $"+price);
    }
}
