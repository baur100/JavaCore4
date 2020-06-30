package hw9hh;

public class Child {
    public String firstName;
    public String lastName;
    public int age;
    public String grade;

    public void intro(String schoolName) {
        System.out.println("Hello, my name is "+firstName+" "+lastName+
                "\nI'm "+age+" years old" +
                "\nNext year I will be in "+grade+" grade at "+schoolName);
    }

}
