package hw16;

import java.util.ArrayList;

public class Address {

    private String streetAddress;
    private String town;
    private String state;
    private int zip;
    private ArrayList<Doctor> doctors;


    public Address(String streetAddress, String town, String state, int zip, ArrayList<Doctor> doctors) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
        this.doctors = doctors;
    }
}
