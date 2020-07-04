package Example.Spare2;


public class Address {
    private String street;
    private String city;
    private String state;
    private int zip;
    private boolean birthdayParty;


    public Address() {
    }

    public Address(String street, String city, String state, int zip, boolean birthdayParty) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.birthdayParty = birthdayParty;
    }


    public boolean isBirthdayParty() {
        return birthdayParty;
    }

    public void setBirthdayParty(boolean birthdayParty) {
        this.birthdayParty = birthdayParty;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public void printAddress() {
        System.out.println("Street: " + street + "City: "+ city +
                "State: " + state + " Zip: " + zip);
        if (this.birthdayParty){
            System.out.println("There is a Birthday Party today!!");
        }else {
            System.out.println("Sorry no birthday party :(");
        }
    }


}