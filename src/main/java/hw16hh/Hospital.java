package hw16hh;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctorList;
    private Map<Integer, String> rooms;
    private List<InsCo> acceptedIns;

    public Hospital(String hospitalName, Address address, List<Doctor> doctorList, Map<Integer, String> rooms, List<InsCo> acceptedIns) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctorList = doctorList;
        this.rooms = rooms;
        this.acceptedIns = acceptedIns;
    }

    @Override
    public String toString() {
        return "Hospital: " + hospitalName +
                "\n" + address +
                "\n**********************************************"+
                "\ndoctorList=" + doctorList +
                "\n**********************************************"+
                "\nrooms=" + rooms +
                "\n**********************************************"+
                "\nacceptedIns=" + acceptedIns;
    }

    public void printHospital() {
        System.out.println(toString());
    }
}
