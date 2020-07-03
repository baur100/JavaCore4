package HW11;

public class City {

    private String cityName;
    private String street;
    private int buildingNumber;

    public City(String cityName, String street, int buildingNumber) {

        this.cityName = cityName;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public City () {}

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void printCity() {

        System.out.println("City is called = " + cityName + "\nStreet is called " + street + "\nThe building number is " + buildingNumber);
    }
}
