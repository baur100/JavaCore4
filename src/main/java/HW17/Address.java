package HW17;

public class Address {

private String addressLine;
private String town;
private String state;
private int zip;

    public Address(String addressLine, String town, String state, int zip) {
        this.addressLine = addressLine;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
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

    public void printInfo(){
        System.out.println("The address is: " + addressLine + "\nTown = " + town + "\nState = " + state + "\nZip" + zip);

    }
}
