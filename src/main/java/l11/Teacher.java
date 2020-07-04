
package l11;

public class Teacher {
    private String name;
    private String lastName;
    private String subject;
    private Address address;

    public Teacher(String name, String lastName, String subject, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.subject = subject;
        this.address = address;
    }
    public void printInfo(){
        System.out.println("Name = " + this.name);
        System.out.println("Last Name = "+ lastName);
        System.out.println("Subject = " +subject);
        address.printAddress();
    }
}

