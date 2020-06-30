package l10;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public Person(String n,String l,int y){
        this.name=n;
        this.lastName=l;
        year=y;
    }
    public Person(){}

    public Person(String n, String l){
        name=n;
        lastName=l;
    }


    public void printInfo(){
        System.out.println("Name = "+name+"\nLastName = "+lastName+"\nYear = "+year);
    }
}
