package HomeWork16July11;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Hospitals {
    private String hospitalName;
    private List<Address> address = new ArrayList<Address>();
    private List<Doctor> doctors = new ArrayList<Doctor>();
    private HashMap<Integer,String> rooms = new HashMap<Integer, String>();
    private ArrayList<InsuranceCompanies> acceptedInsurances = new ArrayList<InsuranceCompanies>();

    public Hospitals(String hospitalName, List<Address> address, List<Doctor> doc, HashMap<Integer,String> room, ArrayList<InsuranceCompanies> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doc;
        this.rooms = room;
        this.acceptedInsurances = acceptedInsurance;
    }

    public void printHsptlInfo() {
        System.out.println("Hospitals{" +
                "hospitalName='" + hospitalName + '\'' +
//                ", address=" + address +
//                ", doctors=" + doctors +
                ", rooms=" + rooms.values() +
                ", acceptedInsurances=" + acceptedInsurances +
                '}');
        for (Address a : address) {
            a.addressInfo();
        }
        for (Doctor d :doctors) {
            d.printDoctors();
        }

    }


}
