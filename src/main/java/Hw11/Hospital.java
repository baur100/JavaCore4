package Hw11;

public class Hospital {
    private String addressLine;
    private String city;
    private String state;
    private int zip;
    private boolean isPrivate;

    public Hospital(String addressLine, String city, String state, int zip, boolean isLegit) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.isLegit=isLegit;
    }
    public boolean isLegit() {
        return isLegit;
    }

    public void setLegit(boolean aWrong) {
        isPrivate = aWrong;
    }

    public Hospital() {
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
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

    public void printAddress(){
        System.out.println("Address{" +
                "addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}');
        if(isLegit()){
            System.out.println("This is a legit address");}
        else{
            System.out.println("This is a wrong address");
        }
    }
}
