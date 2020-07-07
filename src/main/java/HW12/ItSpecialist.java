package HW12;

public class ItSpecialist {

    protected String name;
    protected String lastName;
    protected String position;

    public ItSpecialist(String name, String lastName, String position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public ItSpecialist() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printInfo() {

        System.out.println("My name is " + name + "\nMy last name is " + lastName + "\nMy position is " + position);
    }

}
