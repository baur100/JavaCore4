package HomeWork16July11;

public class Address {
    protected String streetAddress;
    protected String town;
    protected String state;
    protected int zipCode;
    protected boolean isPrivate;


    public Address(String addressLine, String city, String state, int zipCode, boolean isPrivate) {
        this.streetAddress = addressLine;
        this.town = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isPrivate = isPrivate;
    }

    public void addressInfo() {
        System.out.println("Address{" +
                "addressLine='" + streetAddress + '\'' +
                ", city='" + town + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
//                ", isPrivate=" + isPrivate +
                '}');
    }



}
