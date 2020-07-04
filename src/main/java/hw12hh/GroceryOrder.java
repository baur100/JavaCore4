package hw12hh;

import java.util.Arrays;

public class GroceryOrder extends Orders {
    private String[] groceryItems;

    public GroceryOrder(int orderID, String orderName, Customer customer, int totalPrice, String[] groceryItems) {
        super(orderID, orderName, customer, totalPrice);
        this.groceryItems = groceryItems;
    }

    @Override
    public String toString() {
        return "GroceryOrder{" +
                "orderID=" + orderID +
                ", orderName='" + orderName + '\'' +
                ", customer='" + customer + '\'' +
                ", groceryItems=" + Arrays.toString(groceryItems) +
                ", totalPrice= $" + totalPrice +
                '}';
    }

    public void printGrocery() {
        System.out.println(toString());
    }
}
