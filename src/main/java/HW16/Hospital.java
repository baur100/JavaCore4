package HW16;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital() {
    }

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printHospitalInfo(){
        System.out.println(hospitalName);
        address.printAddress();
        System.out.println("\n" +
                "List of Chicago Health Hospital Doctors:");
        for (Doctor v: doctors) {
            System.out.println(v.printDr());
        }
        System.out.println("\n" +
                "List of Rooms of Chicago Health Hospital:");
        for (Map.Entry<Integer, String> pair:rooms.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println("\n" +
                "Chicago Health Hospital accepts following insurances:");
        for (InsuranceCompanies v: acceptedInsurances){
            System.out.println(v);
        }
    }

    public void printDoctors() {
        for (Doctor v : doctors) {
            System.out.println(v.printDr());
        }
    }

    public void printRooms () {
        for (Map.Entry<Integer, String> pair : rooms.entrySet()) {
            System.out.println("Room #" + pair.getKey() + ": " + pair.getValue());
        }
    }

}

