package Hw16;

import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctor;
    private HashMap<Integer, String> rooms;
    private List<Insurance> acceptedInsurance;

    public Hospital(String hospitalName, Address address, List<Doctor> doctor, HashMap<Integer, String> rooms, List<Insurance> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctor = doctor;
        this.rooms = rooms;
        this.acceptedInsurance = acceptedInsurance;
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

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranceCompanies> getAcceptedInsurance() {
        return acceptedInsurance;
    }

    public void setAcceptedInsurance(List<InsuranceCompanies> acceptedInsurance) {
        this.acceptedInsurance = acceptedInsurance;
    }
}




