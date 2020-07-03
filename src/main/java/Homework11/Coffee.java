package Homework11;

public class Coffee {
    private String bean;
    private String[] coffeeType;

    public Coffee(String bean, String[] coffeeType) {
        this.bean = bean;
        this.coffeeType = coffeeType;
    }

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean;
    }

    public String[] getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String[] coffeeType) {
        this.coffeeType = coffeeType;
    }

    public void printCoffeeInfo() {
        System.out.println(this.bean);
        for (String v : this.coffeeType) {
            System.out.println(v);
        }
    }
}