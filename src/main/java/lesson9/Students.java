package lesson9;

public class Students {
    public String name;
    public String lastName;
    public String major;
    public String collegeName;


    public void printInfo(){
        System.out.println(name+ " "+lastName);
        System.out.println("My major is public policy");
        System.out.println("I'm a student at "+collegeName);
    }
}
