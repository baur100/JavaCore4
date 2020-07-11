package HomeWork14ArrayLists;

public class Address14 {
    protected String addressLine;
    protected String city;
    protected String state;
    protected int zipCode;
    protected boolean isPrivate;


    public Address14(String addressLine, String city, String state, int zipCode, boolean isPrivate) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isPrivate = isPrivate;
    }

    public void addressInfo() {
        System.out.println("Address{" +
                "addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", isPrivate=" + isPrivate +
                '}');
    }



}
