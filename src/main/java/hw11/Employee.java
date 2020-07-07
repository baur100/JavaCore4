package hw11;

public class Employee {
    private String name;
    private String lastName;
    private String[] pets;
    private Address address;


    public Employee(String name, String lastName, String[] pets, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.pets = pets;
        this.address = address;
    }

    public Employee() {
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

    public String[] getPets() {
        return pets;
    }

    public void setPets(String[] pets) {
        this.pets = pets;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.lastName);
        for (String v : this.pets) {
            System.out.println(v);
        }
//    this.address.printAddress();
    }
}
