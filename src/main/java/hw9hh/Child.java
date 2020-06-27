package hw9hh;

public class Child {
    public String firstName;
    public String lastName;
    public int age;
    public String grade;

    public void intro(String schoolName) {
        System.out.println("Hello, my name is "+firstName+" "+lastName);
        System.out.println("I'm "+age+" years old");
        System.out.println("Next year I will be in "+grade+" grade at "+schoolName);
    }

}
