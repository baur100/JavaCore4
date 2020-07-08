package Homework13;

public class Rectangle implements Shape{
    private int b;
    private int c;

    public Rectangle(int b, int c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public int getPerimeter(){
        return (2*b)+(2*c);
    }
}
