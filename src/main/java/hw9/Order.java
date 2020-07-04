package hw9;
import java.util.ArrayList;
public class Order {
    private ArrayList <String> items;
    private double price;
    private double discount;

    public Order() {}

    public Order(ArrayList <String> items, double price, double discount){
        setItems(items);
        setPrice(price);
        setDiscount(discount);
    }

    public String getItems(){
        return items.toString();
    }

    public double getPrice() {
        return this.price;
    }

    public double getDiscount(){
        return this.discount;
    }

    public void setItems(ArrayList<String>items){
        this.items = items;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public void addItem(String item){
        items.add(item);
    }

    public void useDidcount(){
        this.price = this.price*this.discount;
    }

    public void printInfo() {
        System.out.println(getItems());
        System.out.printf("Price : %.2f", price);
        System.out.println(", discount : " + discount);
    }

}
