package hw12Inheritance;

import java.util.Arrays;

public class Grocery extends DutyFree {
    private String cashier;
    private String[] products;

    public Grocery(String owner, int licenceNumber, Address address, String cashier, String[] products) {
        super(owner, licenceNumber, address);
        this.cashier = cashier;
        this.products = products;
    }

    public void printGrocery() {
        System.out.println("Grocery{" +
                "cashier='" + cashier + '\'' +
                ", products=" + Arrays.toString(products) +
                ", owner='" + owner + '\'' +
                ", licenceNumber=" + licenceNumber +
                '}');
        this.address.printAddress();
    }
}





