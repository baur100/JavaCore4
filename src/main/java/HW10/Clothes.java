package HW10;

public class Clothes {

    private String brand;
    private String item;
    private int price;

    public Clothes(String brand, String item, int price) {

        this.brand = brand;
        this.item = item;
        this.price = price;

    }


    public void setName() {

        this.brand = brand;
    }

    public void setSex() {

        this.item = item;
    }

    public void setYear() {

        this.price = price;
    }

    public String getName() {

        return brand;

    }

    public String getSex() {

        return item;
    }

    public int getYear() {

        return price;

    }
    public void printOut() {

        System.out.println("Brand= " + brand + "\nItem= " + item + "\nPrice= " + price);
    }
}
