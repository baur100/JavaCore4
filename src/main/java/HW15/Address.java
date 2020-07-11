package HW15;

public class Address {
    private String addressLine1;
    private String city;
    private String state;
    private int zip;

    public Address (){}

    public Address(String addressLine1, String city, String state, int zip) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
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
        System.out.println(addressLine1 + ", " + city + ", " + state + " " + zip);
    }
}
