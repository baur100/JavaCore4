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
        return super.toString()+
                "\nmacysItems=" + Arrays.toString(macysItems);
    }

    public void printMacys() {
        System.out.println(toString());
    }
}
