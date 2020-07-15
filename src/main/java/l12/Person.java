package l12;

public abstract class Person {
    protected String name;
    protected String lastName;
    protected Address address;
    protected College college;

    public Person(String name, String lastName, Address address, College college) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.college = college;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}
