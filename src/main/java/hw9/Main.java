package hw9;
import java.util.ArrayList;
public class Main {
    public static void main(String []args){
        BankAccount michael = new BankAccount("Michael", 528.69, "123456789");
        michael.printInfo();
        BankAccount john = new BankAccount();
        john.setOwner("John");
        john.setAccountId("987654321");
        john.setBalance(1000.0);
        john.printInfo();

        Book funny = new Book("Funny stories", "Unknown", 2020);
        funny.printInfo();
        Book animals = new Book();
        animals.setName("Animals");
        animals.setAuthor("Someone");
        animals.setYear(2019);
        animals.printInfo();

        String []colors = {"White","Black","Yellow","Blue","Pink","Red"};
        Crayons set1 = new Crayons(colors, "Crayola", 24);
        set1.printInfo();
        Crayons set2 = new Crayons();
        set2.setColors(colors);
        set2.setCompany("Best Crayons");
        set2.setSize(50);
        set2.printInfo();

        ArrayList <String> items = new ArrayList<String>();
        items.add("potatoes");
        items.add("cola");
        items.add("chicken");
        Order order1 = new Order(items, 34.28, 0.05);
        order1.useDidcount();
        order1.printInfo();
        Order order2 = new Order();
        order2.setDiscount(0.07);
        order2.setItems(items);
        order2.setPrice(34.28);
        order2.useDidcount();
        order2.printInfo();
    }
}
