package hw12Inheritance;

public class DutyFree {
protected String owner;
protected int licenceNumber;
protected Address address;

    public DutyFree(String owner, int licenceNumber, Address address) {
        this.owner = owner;
        this.licenceNumber = licenceNumber;
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

