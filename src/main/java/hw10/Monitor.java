package hw10;

public class Monitor {
    private int  size;
    private int price;
    private int inches;

    public Monitor() {}


    public Monitor (int size, int price, int inches) {

        this.size= size;
        this.price= price;
        this.inches =inches;


    }

    public void printData() {
        System.out.println("Monitor size is " + size + "\n"
                + "it's price is " + price + " and it's " + inches+ "wide");

    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 10) {
            System.out.println(size);
        } else {
            System.out.println("too small");
        }
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        if (price > 500) {
            System.out.println(price);
        } else {
            System.out.println("out of stock");
        }

    }


    public int getInches(){
        return inches;
    }


    public void setInches(int inches) {
        if (inches < 30) {
            System.out.println(inches);
        } else {
            System.out.println("larger screen needed");
        }
    }


}

