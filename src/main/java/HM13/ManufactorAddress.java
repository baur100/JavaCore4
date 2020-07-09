package HM13;

public class ManufactorAddress {
    private String street;
    private String city;
    private String country;

    public ManufactorAddress(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;

    }

    public ManufactorAddress() {
    }

    public String getAddressLine() {
        return street;
    }

    public void setAddressLine(String addressLine) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return country;
    }

    public void setState(String state) {
        this.country = country;
    }


    public void printAddress() {
        System.out.println("Manufactor Address: " +
                "\nStreet = " + street +
                "\nCity = " + city +
                "\nState= " + country);

    }
}

