package l13a;

public class Rectangle implements Shape{
    private double wide;
    private double height;

    public Rectangle(double wide, double height) {
        this.wide = wide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * this.wide;
    }
}
