package hw13hh;

public class Cylinder implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return radius * radius * Math.PI * height;
    }

    @Override
    public void printVolume() {
        System.out.println("This is the volume of this tube.");
    }
}
