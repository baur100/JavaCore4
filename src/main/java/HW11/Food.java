package HW11;

public class Food {

    private String item;
    private String color;
    private int price;

    public Food(String item, String color, int price) {

       this.item = item;
       this.color = color;
       this.price = price;

    }

    public Food() {}


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printMe() {

        System.out.println("Item= " + item + "\nColor= " + color + "\nPrice= " + price);
    }
}
