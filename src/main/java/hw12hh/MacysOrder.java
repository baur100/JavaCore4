package hw12hh;

import java.util.Arrays;

public class MacysOrder extends Orders {
    private String [] macysItems;

    public MacysOrder(int orderID, String orderName, Customer customer, int totalPrice, String[] macysItems) {
        super(orderID, orderName, customer, totalPrice);
        this.macysItems = macysItems;
    }

    @Override
    public String toString() {
        return "MacysOrder{" +
                "macysItems=" + Arrays.toString(macysItems) +
                ", orderID=" + orderID +
                ", orderName='" + orderName + '\'' +
                ", customer=" + customer +
                ", totalPrice= $" + totalPrice +
                '}';
    }

    public void printMacys() {
        System.out.println(toString());
    }
}
