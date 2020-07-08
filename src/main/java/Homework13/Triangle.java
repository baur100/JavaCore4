package Homework13;

public class Triangle implements Shape{
    private int d;
    private int e;
    private int f;

    public Triangle(int d, int e, int f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public int getPerimeter(){
        return d+e+f;
    }
}
