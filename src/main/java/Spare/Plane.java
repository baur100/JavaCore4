package Spare;

public class Plane {
    private int planenumber;
    private String airlines;
    private String make;

    public Plane() {
    }

    public void setPlanenumber(int planenumber) {
        this.planenumber = planenumber;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPlanenumber() {
        return planenumber;
    }

    public String getAirlines() {
        return airlines;
    }

    public String getMake() {
        return make;
    }

    public Plane(int planenumber, String airlines, String make) {
        this.planenumber = planenumber;
        this.airlines = airlines;
        this.make = make;

    }

    public void printinfo() {
        System.out.println("This plane number is " + planenumber + ".");
        System.out.println("This plane's airlines is " + airlines + ".");
        System.out.println("This plane's make is " + make + ".");
    }

}

