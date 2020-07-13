package HW17;

import java.util.List;

public class Customers {
    private String name;
    private Menu menu;
    private List<Cards> payment;

    public Customers(String name, Menu menu, List<Cards> payment) {
        this.name = name;
        this.menu = menu;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Cards> getPayment() {
        return payment;
    }

    public void setPayment(List<Cards> payment) {
        this.payment = payment;
    }


    public void printCustomerInfo() {
        System.out.println("Customers{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                ", payment=" + payment +
                '}');
    }
}
