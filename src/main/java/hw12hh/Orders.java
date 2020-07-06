package hw12hh;

public class Orders {
    protected int orderID;
    protected String orderName;
    protected Customer customer;
    protected int totalPrice;

    public Orders(int orderID, String orderName, Customer customer, int totalPrice) {
        this.orderID = orderID;
        this.orderName = orderName;
        this.customer = customer;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Orders:" +
                "\norderID='" + orderID + '\'' +
                "\norderName='" + orderName + '\'' +
                "\ncustomer=" + customer +
                "\ntotalPrice= $" + totalPrice;
    }

    public void printOrders() {
        System.out.println(toString());
    }
}
