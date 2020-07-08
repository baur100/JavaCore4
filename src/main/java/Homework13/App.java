package Homework13;

public class App {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        System.out.println("Perimeter of square1 = "+square1.getPerimeter());

        Square square2 = new Square(3);
        System.out.println("Perimeter of square2 = "+square2.getPerimeter());

        System.out.println("**********************************");

        Rectangle rectangle1 = new Rectangle(9, 7);
        System.out.println("Perimeter of rectangle1 = "+rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(100, 51);
        System.out.println("Perimeter of rectangle2 = "+rectangle2.getPerimeter());

        System.out.println("**********************************");

        Triangle triangle1 = new Triangle(1,2,3);
        System.out.println("Perimeter of triangle1 = "+triangle1.getPerimeter());

        Triangle triangle2 = new Triangle(13,323,28);
        System.out.println("Perimeter of triangle2 = "+triangle2.getPerimeter());

        System.out.println("**********************************");

        Shape x1 = new Square(3);
        Shape x2 = new Rectangle(13,5);
        Shape x3 = new Triangle(28,3,8);

        Shape[] shapes = {x1,x2,x3};

        for(Shape v:shapes){
            System.out.println(v.getPerimeter());
        }
    }
}
