package lesson10;

public class Person {
    // This is default constructor
    public String name;
    public String lastName;
    public int year;

    public Person(String n, String l, int y){
        name=n;
        lastName=l;
        year=y;

    }

    public Person(){ }

    public Person(String n, String l){
        name=n;
        lastName=l;
    }

    public void printInfo(){
        System.out.println("Name = "+name+"\nLastName = "+lastName+"\nYear = "+year);

    }

}
