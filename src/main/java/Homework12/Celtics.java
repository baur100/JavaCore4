package Homework12;

public class Celtics extends Basketball {
    private int age;
    private String born;

    public Celtics(String name, String lastName, String city, String championships, int age, String born) {
        super(name, lastName, city, championships);
        this.age = age;
        this.born = born;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public void printCelticInfo(){
        System.out.println("First Name = "+name+" Last Name = "+lastName+" Team City = "+city+" Number of rings = "+championships+" Age = "+age+" Born = "+born);
    }
}
