package l17Hw;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public Address(String streetAddress, String town, String state, int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;

    }

    public  void getAddress(){
        System.out.println(this.streetAddress + ", " + this.town + ", " + this.state + ", " + this.zip );
    }
}
