package HM16;

public class Hospital {
    private String hospitalName;
    private Address address;

    public Hospital(String hospitalName, Address address) {
        this.hospitalName = hospitalName;
        this.address = address;
    }
    public void printHospital() {
        System.out.println("Hospital = " + hospitalName );
        this.address.printAddress();
    }
}
