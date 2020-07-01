package Class10Jun29;

public class Person {
    public String firstName;
    public String lastName;
    public int year;

//    Parameterized Constructor
    public Person(String n, String l, int y){
        firstName = n;
        lastName = l;
        year = y;
    }

//    Non-Parameterized Constructor
    public Person(){}

//    Partially Parameterized Constructor
    public Person(String n, String l){
        firstName = n;
        lastName = l;
    }

    public void printInfo(){
        System.out.println("Name = "+firstName+"\nlastName = "+lastName+"\nYear = "+year);
    }


}
