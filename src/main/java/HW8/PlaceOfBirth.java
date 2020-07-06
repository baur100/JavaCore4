package HW8;

public class PlaceOfBirth {
    public String cityName;
    public String country;
    public int dateOfBirth;

    public void iWasBorn(){
        System.out.println("I was born in " + country + "," + cityName + " city" + ", in " + dateOfBirth);
    }
}
