package HW11;

public class Address {
    private String streetName;
    private String city;
    private String state;
    private int zip;

    public Address(String streetName, String city, String state, int zip) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public void getAddress(){
        System.out.println("Street Name = " + streetName + "\nCity= " + city + "\nState=" + state + "\nzip= " + zip);
    }
}
