package June27;

public class Student {
    public String name;
    public String lastName;
    public String major;
    public String collegeName;

    public void printInfo(){
        System.out.println(name+" "+lastName);
        System.out.println("My major is "+major);
        System.out.println("I'm a student at "+collegeName);
    }

}
