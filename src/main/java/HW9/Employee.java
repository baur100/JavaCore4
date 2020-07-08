package HW9;

public class Employee {
    public String name;
    public String lastName;
    public int rateDollars;

    public void intro (String catName) {
        System.out.println("Hello. I'm " + name + " " + lastName);
        System.out.println("I have a pet. His name is " + catName);
    }
    public void myWages (){
        System.out.println("I'm " + name + " " + lastName + ".");
        System.out.println("I make " + rateDollars + " per hour.");
    }


}
