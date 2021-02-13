package HW17;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        List<Cards> payment1= new ArrayList<Cards>();
        List<Cards> payment2= new ArrayList<Cards>();

        Customers frank= new Customers("Frank", Menu.Burger,payment1);
        payment1.add(Cards.VISA);
        payment1.add(Cards.DISCOVER);

        Customers michael= new Customers("Michael", Menu.Croissant,payment2);
        payment2.add(Cards.MASTERCARD);

        System.out.println("\n*************************************************************************");
        frank.printCustomerInfo();
        System.out.println("\n*************************************************************************");
        michael.printCustomerInfo();
        System.out.println("\n*************************************************************************");
    }
}
