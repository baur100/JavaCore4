package HW16_1;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private int zip;

    public Address(){}

    public Address(String streetAddress, String city, String state, int zip) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getAddressLine1() {
        return streetAddress;
    }

    public void setAddressLine1(String addressLine1) {
        this.streetAddress = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void printAddress (){
        System.out.println("Address: " + streetAddress + ", " + city + ", " + state + " " + zip);
    }
}
