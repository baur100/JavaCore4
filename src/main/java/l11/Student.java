package l11;

public class Student {
    private String name;
    private String lastName;
    private String[] subjects;
    private String major;
    private Address address;

    public Student(String name, String lastName, String[] subjects, String major, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.subjects = subjects;
        this.major = major;
        this.address=address;
    }

    public Student() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.lastName);
        System.out.println(this.major);
        for(String v:this.subjects){
            System.out.println(v);
        }
//        System.out.println(this.address);
//        this.address.printAddress();
        System.out.println(this.address.getAddressLine());
        System.out.println(this.address.getCity());
        System.out.println(this.address.getState());
        System.out.println(this.address.getZip());
    }
}
