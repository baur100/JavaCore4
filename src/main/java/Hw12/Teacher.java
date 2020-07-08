package Hw12;


import java.util.Arrays;

public class Teacher extends Person {
    private String[] danceClass;
    private String certification;


    public Teacher(String name, String lastName, Address address, int age, String[] danceClass, String certification) {
        super(name, lastName, address, age);
        this.danceClass = danceClass;
        this.certification = certification;

    }

    public void printTeacher() {
        System.out.println("Teacher's name  is " + this.name + " " + lastName);
        System.out.println("\nThis teacher specialty is  " + Arrays.toString(danceClass));
        System.out.println("\nThis teacher has been " + certification + " for teaching these classes");
//        address.printTeacher();
    }
}
