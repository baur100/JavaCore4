package Class11July1;

public class Student {
    private String firstName;
    private String lastName;
    private String[] subjects;
    private String major;
    Address address;

    public Student(){}

    public Student(String firstName, String lastName, String[] subjects, String major, Address add) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
        this.major = major;
        this.address = add;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName;}

    public String[] getSubjects() { return subjects; }
    public void setSubjects(String[] subjects) { this.subjects = subjects; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public void printInfo(){
        System.out.println("\n"+this.firstName+" "+this.lastName+"\n"+this.major);
        for (String s:this.subjects) {
            System.out.println(s);
        }
        System.out.println(this.address.getAddressLine());
        System.out.println(this.address.getCity());
        System.out.println(this.address.getState());
        System.out.println(this.address.getZipCode());
        this.address.printAddress();
    }




}
