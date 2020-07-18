package Hw14;

public class Mushroom {
    private String name;


    public Mushroom(String name) {
        this.name = name;
    }

    @Override

    public String toString() {
        return "\nMushroom:" + " " + name ;
    }
}

