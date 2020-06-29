package lesson9;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public void hello(String friedName){
        System.out.println("Hello " +friedName);
        System.out.println("I'm "+friedName+" "+lastName);
        System.out.println("Nice to meet you");
    }
}
