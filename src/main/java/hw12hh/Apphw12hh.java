package hw12hh;

import l12.Address;

public class Apphw12hh {
    public static void main(String[] args) {
        CustomerAddress johnAddress = new CustomerAddress("123 Cherry Lane", "Brooklyn", "NY", 11201);
        Customer john = new Customer("John", "Barton", johnAddress);
        String[] johnGroceryItems = {"Apples", "Asparagus", "Bananas", "Yogurt", "Eggs", "Milk"};
        GroceryOrder johnGrocery = new GroceryOrder(1002,"John's Grocery", john, 49, johnGroceryItems);
        johnGrocery.printGrocery();

        System.out.println("*************************************************");

        CustomerAddress mindyAddress = new CustomerAddress("555 Bolton Street", "New York", "NY", 10001);
        Customer mindy = new Customer("Mindy", "Kaling", mindyAddress);
        String[] mindyGroceryItems = {"Beans", "Bread", "Ice Cream", "Chips"};
        GroceryOrder mindyGrocery = new GroceryOrder(1003, "Mindy's Grocery", mindy, 35, mindyGroceryItems);
        mindyGrocery.printGrocery();

        System.out.println("*************************************************");

        CustomerAddress billAddress = new CustomerAddress("5624 Monroe Ave", "Los Angeles", "CA", 37562);
        Customer bill = new Customer("Bill", "Hader", billAddress);
        String[] billBestBuyItems = {"iPhone XR", "Extension Cords", "Batteries", "Mouse Pad"};
        BestBuyOrder billBestBuy = new BestBuyOrder(300, "Bill's Electronics", bill, 965, billBestBuyItems);
        billBestBuy.printBestBuy();

        System.out.println("*************************************************");

        String[] mindyBestBuyItems = {"Samsung Notebook", "Apple Watch", "Keyboard"};
        BestBuyOrder mindyBestBuy = new BestBuyOrder(305, "Mindy's Electronics", mindy, 1039, mindyBestBuyItems);
        mindyBestBuy.printBestBuy();

        System.out.println("*************************************************");

        String[] johnMacysItems = {"Dockers Pants", "Boxer Briefs", "Socks", "Ties"};
        MacysOrder johnMacys = new MacysOrder(601, "John's Clothing", john, 70, johnMacysItems);
        johnMacys.printMacys();

        System.out.println("*************************************************");

        CustomerAddress lindaAddress = new CustomerAddress("89 E 10th St", "New York", "NY", 10002);
        Customer linda = new Customer("Linda", "Poole", lindaAddress);
        String[] lindaMacysItems = {"Shoes", "Nike Sneakers", "Dresses", "Hat"};
        MacysOrder lindaMacys = new MacysOrder(606, "Linda's Clothing", linda, 315, lindaMacysItems);
        lindaMacys.printMacys();

        System.out.println("*************************************************");

        Orders amazon = new Orders(2000, "Amazon Order", linda, 55);
        amazon.printOrders();

        System.out.println("*************************************************");

        CustomerAddress susanAddress = new CustomerAddress("700 Maple Ave", "Flushing", "NY", 11335);
        Customer susan = new Customer("Susan", "Lee", susanAddress);
        Orders etsy = new Orders(11, "Etsy Order", susan, 140);
        etsy.printOrders();
    }
}
