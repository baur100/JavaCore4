package hw11;

public class Student {
    private String firstName;
    private String lastName;
    private String ID;

    public Student(){}

    public Student(String firstName, String lastName, String ID) {
        setFirstName(firstName);
        setLastName(lastName);
        setID(ID);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void printInfo(){
        System.out.println(this.firstName + " " + this.lastName + " " + this.ID);
    }
}
