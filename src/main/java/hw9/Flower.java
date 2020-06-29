package hw9;

public class Flower {
    public String name;
    public String color;
    public String scent;

    public void hello(String flowerDescription) {
        System.out.println("This is " + flowerDescription);
        System.out.println("It's color is " + color);
        System.out.println("This flower has " + scent + " scent");
    }
}
