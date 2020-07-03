package Hw10;

public class Pizza {
    private String name;
    private String crust;
    private String topping;
    private String drink;

    public Pizza(String name, String crust, String topping, String drink) {
        this.name = name;
        this.crust = crust;
        this.topping = topping;
        this.drink = drink;
    }

    public Pizza() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setTopping(String topping) {

        this.topping = topping;
    }

    public void setDrink(String drink) {

        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public String getCrust() {
        return crust;
    }

    public String getTopping() {
        return topping;
    }


    public String getDrink() {
        return drink;
    }

    public void printOut() {
        System.out.println("This is  " + name + " pizza" + "\nCrust  " + crust + "\nTopping " + topping + "\nPaired with " + drink);
    }
}





