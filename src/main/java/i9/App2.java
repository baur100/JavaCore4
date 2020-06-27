package i9;

public class App2 {
    public static void main(String[] args) {
        Student john = new Student();
        john.name="John";
        john.lastName="Sullivan";
        john.collegeName="MIT";
        john.major="French potry";

        john.printInfo();

        Fruit apple= new Fruit();
        apple.name = "Apple";

        Fruit peach = new Fruit();
        peach.name = "Peach";

        System.out.println(apple.name);
    }
}
