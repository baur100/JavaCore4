package Class11July1;

import java.io.StringBufferInputStream;

public class Address {
    private String addressLine;
    private String city;
    private String state;
    private int zipCode;
    private boolean isPrivate;

//    Empty Constructor
    public Address(){}

//    Parametereized constructor
    public Address(String addressLine, String city, String state, int zipCode, boolean isPrivate) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isPrivate = isPrivate;
    }

    public String getAddressLine() { return addressLine; }
    public void setAddressLine(String addressLine) { this.addressLine = addressLine; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public int getZipCode() { return zipCode; }
    public void setZipCode(int zipCode) { this.zipCode = zipCode; }

    public boolean isPrivate() { return isPrivate; }
    public void setPrivate(boolean aPrivate) { isPrivate = aPrivate; }

    public void printAddress(){
        System.out.println("HouseAddress{" +
                    "addressLine='" + addressLine + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zipCode=" + zipCode +
                    '}');
        if(isPrivate)
            System.out.println("This is a private address");
        else
            System.out.println("This is a company address");
    }

}
