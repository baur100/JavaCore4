package HW11;

public class Company {
    private String name;
    private String[] departments;
    private Address address;

    public Company(String name, String[] departments, Address address) {
        this.name = name;
        this.departments = departments;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void getCompanyInfo(){
        System.out.println("Company Name = " + name);
        for (String v:departments) {
            System.out.println(v);
        }
       this.address.getAddress();
    }
}
