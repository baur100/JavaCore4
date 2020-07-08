package Homework13;

public class Square implements Shape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int getPerimeter(){
        return 4*a;
    }
}
