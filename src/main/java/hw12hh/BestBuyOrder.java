package hw12hh;

import java.util.Arrays;

public class BestBuyOrder extends Orders {
    private String[] bestBuyItems;

    public BestBuyOrder(int orderID, String orderName, Customer customer, int totalPrice, String[] bestBuyItems) {
        super(orderID, orderName, customer, totalPrice);
        this.bestBuyItems = bestBuyItems;
    }

    @Override
    public String toString() {
        return "BestBuyOrder{" +
                "orderID=" + orderID +
                ", orderName='" + orderName + '\'' +
                ", customer=" + customer +
                ", bestBuyItems=" + Arrays.toString(bestBuyItems) +
                ", totalPrice= $" + totalPrice +
                '}';
    }

    public void printBestBuy() {
        System.out.println(toString());
    }
}
