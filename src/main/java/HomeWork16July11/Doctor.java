package HomeWork16July11;

import org.w3c.dom.ls.LSOutput;

public class Doctor {
    private String firstName;
    private String lastName;
    private Title title;

    public Doctor(String firstName, String lastName, Title title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void printDoctors(){
        System.out.println("Doctor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title=" + title +
                '}');
    }
}
