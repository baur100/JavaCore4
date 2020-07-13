package HW16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;


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

    public void PrintDoctor() {
        int i = 0;
        System.out.println("Hospital : " + hospitalName + '\'' +
                ", address : " + address.getStreetAddress() + " "
                + address.getTown() + ", "
                + address.getState() + " " + address.getZip());
        for (Doctor v : doctors) {
            System.out.println("dr " + v.getName() + " " + v.getLastName() +" " + v.getPosition());

//            System.out.println(this.rooms.get(101+i) + this.rooms.get);
//            System.out.println(this.acceptedInsurances.get(i));
//            i++;
        }
    }
}
