package lesson11;

public class Address {
    private String addressLine;
    private String city;
    private String state;
    private int zip;

    public Address (String addressLine, String city, String state, int zip){
        this.addressLine=addressLine;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }

    public String getAddressLine(){
        return addressLine;
    }
    public void setAddressLine(String addressLine){
        this.addressLine = addressLine;
    }

    public String getCity(){
        return getCity();
    }

    public void setCity(String city){
        this.city=city;
    }

}
