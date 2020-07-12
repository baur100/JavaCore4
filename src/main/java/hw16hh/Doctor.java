package hw16hh;

public class Doctor {
    private String firstName;
    private String lastName;
    private Title title;

    public Doctor(String firstName, String lastName, Title title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    @Override
    public String toString() {
        return "\n" + "Doctor: " +
                "Name=" + firstName + ' ' + lastName +
                ", " + title;
    }

    public void printDoctor() {
        System.out.println(toString());
    }
}
