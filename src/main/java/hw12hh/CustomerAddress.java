package hw12hh;

public class CustomerAddress {
    private String street;
    private String city;
    private String state;
    private int zip;

    public CustomerAddress(String street, String city, String state, int zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

    public void printCustomerAddress() {
        System.out.println(toString());
    }
}
