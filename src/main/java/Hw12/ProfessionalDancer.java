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
        System.out.println("This dancer's " + " name is " + name + " " + lastName +
                "\nThis dancer is " + age + " years old" +
                "\n " + name + " " + lastName + " is successful in these dance styles " + Arrays.toString(danceStyle) + '\'' +
                "\nThe dancer's address is ");
        this.address.printAddress();
        System.out.println("\nThe teacher's name is  " + this.teacher +
                "\nThe dancer's experience level is " + experience);

    }
}

