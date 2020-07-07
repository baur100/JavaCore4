package hw11;

public class Address {
private String addresLine1;
private String city;
private String state;
private int zipCode;

    public Address(String addresLine1, String city, String state, int zipCode) {
        this.addresLine1 = addresLine1;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAddresLine1() {
        return addresLine1;
    }

    public void setAddresLine1(String addresLine1) {
        this.addresLine1 = addresLine1;
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
public void printAddress() {
    System.out.println("Address{" +
            "addresLine1 = '" + addresLine1 + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", zipCode=" + zipCode +
            '}');


    }


}