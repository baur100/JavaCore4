package Hw13;



public class Hw13 {

    public static void main(String[] args) {


//    Create an interface and 2 classes which implements it
//    Create 2ne object to interface type


        Triangle triangle1 = new Triangle(10.2, 15.87, 25.40);
        Square square1 = new Square(25);

        Area a1 = new Triangle(4.8, 3.7, 7.9);
        Area a2 = new Square(8.5);
        Area a3 = new Triangle(5.2, 7.15, 12.4);
        Area a4 = new Square(17.8);

        Area[] areas = {a1,a2,a3,a4};

        for(Area v:areas){
            System.out.println(v.getArea());
        }
    }
}
