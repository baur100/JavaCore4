package Hw11;

public class Address1 {

    private String addressLine1;
    private String city;
    private String state;
    private int zip;
    private int office;


    public Address1(String addressLine1, String city, String state, int zip, int office) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.office = office;

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

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void printAddress1() {
        System.out.println("Address{" +
                "addressLine='" + this.addressLine1 + '\'' +
                ", city='" + this.city + '\'' +
                ", state='" + this.state + '\'' +
                ", zip=" + this.zip +
                ", office=" + this.office);
    }
}






