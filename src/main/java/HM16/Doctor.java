package HM16;

import java.util.List;

public class Doctor {
    private String name;
    private String lastName;
    private Title title;

    public Doctor(String name, String lastName, Title title) {
        this.name = name;
        this.lastName = lastName;
        this.title = title;
    }
    protected void printDoctors(){
        System.out.println(this.name);
        System.out.println(this.lastName);
        System.out.println(this.title);
    }
}
