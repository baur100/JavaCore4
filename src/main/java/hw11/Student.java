package hw11;

public class Student {
    private String name;
    private String lastName;
    private String[] cars;
    private Address address;

    public Student(String name, String lastName, String[] cars, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.cars = cars;
        this.address = address;
    }
    public Student (){

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

    public String[] getCars() {
        return cars;
    }

    public void setCars(String[] cars) {
        this.cars = cars;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printInfo2(){
        System.out.println(this.name);
        System.out.println(this.lastName);
        for (String v : this.cars) {
            System.out.println(v);
        }
        this.address.printAddress();
    }
    }



