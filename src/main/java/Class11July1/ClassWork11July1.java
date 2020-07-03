package Class11July1;

public class ClassWork11July1 {
    public static void main(String[] args) {
        Address home = new Address("112 Hollow St","qwerty","TN",98764,true);
        String firstName = new String("Ted");
        String lastName = new String("Simons");
        String subject = new String("Math");

        Teacher teddySimons = new Teacher("Ted","Simons","Math",home);
        teddySimons.printInfo();

    }
}
