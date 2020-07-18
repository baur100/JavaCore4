package l13;

public class DesktopLight implements Bulb, Plug {
    private String brand;
    private String model;
    private int price;

    public DesktopLight(String brand, String model, int price) {
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

    @Override
    public void bulbStandard() {
        System.out.println("I implement E27 bulb standard - I'm awesome!!!");
    }

    @Override
    public void plugStandard() {
        System.out.println("I use US plug and can be connected to any US power outlet");
    }
}
