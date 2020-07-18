package hw15;

public class Watermelon implements Fruits{
    private String color;
    private int weight;

    public Watermelon(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean haveSeeds() {
        System.out.println("This fruit have seeds!");
        return true;
    }


}