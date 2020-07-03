package Class11July1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    Address address;

    public Teacher(String firstName, String lastName, String subject, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.address = address;
    }

    public void printInfo(){
        System.out.println("FirstName: "+this.firstName);
        System.out.println("LastName: "+this.lastName);
        System.out.println("Subject: "+subject);
        address.printAddress();
    }
}
