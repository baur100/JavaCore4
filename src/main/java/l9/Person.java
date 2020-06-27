package l9;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public void hello(String friendName){
        System.out.println("Hello "+friendName);
        System.out.println("I'm "+name+" "+lastName);
        System.out.println("Nice to meet you");
    }
}
