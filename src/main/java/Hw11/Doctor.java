package Hw11;


public class Doctor {
    private String name;
    private String lastName;
    private String[] services;
    private String specialty;
    private Address1 address1;

    public Doctor(String name, String lastName, String[] services, String specialty, Address1 address1) {
        this.name = name;
        this.lastName = lastName;
        this.services = services;
        this.specialty = specialty;
        this.address1 = address1;
        ;
    }

    public Doctor() {
    }

    public Address1 getAddress1() {
        return address1;
    }

    public void setAddress1(Address1 address) {
        this.address1 = address1;
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

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.lastName);
        System.out.println(this.specialty);
        for (String v : this.services) {
            System.out.println(v);
        }
//        System.out.println(this.address1());
//        address1.printAddress1();
        System.out.println(this.address1.getAddressLine1());
        System.out.println(this.address1.getCity());
        System.out.println(this.address1.getState());
        System.out.println(this.address1.getZip());
        System.out.println(this.address1.getOffice());

    }
}
