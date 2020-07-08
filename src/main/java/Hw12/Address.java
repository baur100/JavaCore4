package Hw12;

public class Address {

    private String addressLine;
    private String city;
    private String state;
    private int zip;


    public Address(String addressLine, String city, String state, int zip) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }


    public Address() {
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
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

    public void printAddress() {
        System.out.println("Address " + addressLine +  ", city " + city + ", state " + state + ", zip " + zip);

    }
}


