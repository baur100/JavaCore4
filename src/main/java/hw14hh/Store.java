package hw14hh;

public class Store {
    private String type;
    private String name;

    public Store(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Store: " +
                "\ntype='" + type + '\'' +
                "\nname='" + name + '\'';
    }

    public void printStore() {
        System.out.println(toString());
    }
}
