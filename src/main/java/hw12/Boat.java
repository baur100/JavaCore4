package hw12;

public class Boat extends Vehicle {
    private String anchor;

    public Boat(){}

    public Boat(String name, int wheels, String color, boolean engine, String anchor){
        super(name, wheels, color, engine);
        setAnchor(anchor);
    }

    public void setAnchor(String anchor){
        this.anchor = anchor;
    }

    public String getAnchor(){
        return this.anchor;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Anchor type: " + anchor);
    }
}
