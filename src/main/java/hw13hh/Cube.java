package hw13hh;

public class Cube implements Volume {
    private double length;
    private double width;
    private double height;

    public Cube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public void printVolume() {
        System.out.println("This is the volume of this block.");
    }
}
