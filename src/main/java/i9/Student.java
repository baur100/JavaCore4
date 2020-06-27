package i9;

public class Student {
    public String name;
    public String lastName;
    public String major;
    public String collegeName;

    public void printInfo(){
        System.out.println(name+" "+lastName);
        System.out.println("My major i " + major);
        System.out.println("I`m a student at "+collegeName);
    }
}
