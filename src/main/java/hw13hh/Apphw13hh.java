package hw13hh;

public class Apphw13hh {
    public static void main(String[] args) {
        Cube cube1 = new Cube(5.0, 5.0, 5.0);

        System.out.println(cube1.getVolume());
        cube1.printVolume();

        System.out.println("*****************************************");

        Cylinder cylinder1 = new Cylinder(3.5, 10);
        double cylinder1Result = cylinder1.getVolume();

        System.out.println(cylinder1Result);
        cylinder1.printVolume();

        System.out.println("*****************************************");

        Volume object1 = new Cube(2.3, 4.6, 9.1);
        Volume object2 = new Cylinder(1.1, 7.0);

        Volume[] allObjects = {object1, object2};

        for (Volume v: allObjects) {
            System.out.println(v.getVolume());
            v.printVolume();
        }
    }
}
