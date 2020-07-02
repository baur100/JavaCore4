package hw11hh;

public class Supplies {
    private String name;
    private int quantity;

    public Supplies(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Supplies{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void printSupplies() {
        toString();
    }
}
