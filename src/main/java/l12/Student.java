package l12;

import java.util.Arrays;

public class Student extends Person {
    private String[] subjects;
    private String major;

    public Student(String name, String lastName, Address address, String[] subjects, String major, College college) {
        super(name,lastName,address,college);
        this.subjects = subjects;
        this.major = major;
    }

    public void printStudent() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                ", major='" + major + '\'' +
                '}');
        this.address.printAddress();
        this.college.printCollege();
    }
}
