package Hw12;

import java.util.Arrays;

public class ProfessionalDancer extends Dancer {
    private String[] danceStyle;
    private String experience;


    public ProfessionalDancer(String name, String lastName, Address address, int age, String dance, String teacher, String[] danceStyle, String experience) {
        super(name, lastName, address, age, dance, teacher);
        this.danceStyle = danceStyle;
        this.experience = experience;

    }

    public void printProfessionalDancer() {
        System.out.println("Dancer's " + " name is " + name + '\'' +
                " lastName is " + lastName + '\'' +
                " This dancer is " + age + " years old" + '\'' +
                " dance " + Arrays.toString(danceStyle) + '\'' +
                " The teacher's name is  " + this.teacher + '\'' +
                "The dancer's experience level is " + experience);
        this.address.printAddress();
    }
}

