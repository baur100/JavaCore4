package l13a;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2.3,4.9);
        Circle circle1 = new Circle(5.3);

//        System.out.println(circle1.getArea());
//        System.out.println(rectangle1.getArea());

        Shape a1 = new Rectangle(2.1,2.3);
        Shape a2 = new Circle(4.2);
        Shape a3 = new Circle(5.2);
        Shape a4 = new Rectangle(2.3,5.6);

        Shape[] shapes = {a1,a2,a3,a4,rectangle1,circle1};

        for(Shape v:shapes){
            System.out.println(v.getArea());
        }

    }
}
