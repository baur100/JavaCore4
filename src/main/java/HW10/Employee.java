package HW10;

public class Employee {
    private String name;
    private String lastName;
    private int rateDollars;

    public Employee (){}

    public Employee (String name, String lastName, int rateDollars){
        this.name = name;
        this.lastName = lastName;
        this.rateDollars = rateDollars;
    }

    public void myWages (){
        System.out.println("I'm " + name + " " + lastName + "." +
                "\nI make " + rateDollars + " per hour.");
    }

    public void printInfo (){
        System.out.println(name +" " + lastName +
                "\nRate per hour "+rateDollars);
    }

    public void setRateDollars (int rateDollars){
        this.rateDollars=rateDollars;
    }

    public int getRateDollars (){
        return rateDollars;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getLastName (){
        return lastName;
    }
}
