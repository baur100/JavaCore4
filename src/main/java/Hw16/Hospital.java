package Hw16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctor;
    private HashMap<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsurance;

    public Hospital(String hospitalName, Address address, List<Doctor> doctor, HashMap<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurance) {
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

    public void printHospital() {
        System.out.println("Hospital name" + hospitalName + " address " + address.AddressPrint());
        for (Doctor d : doctor) {
            System.out.println("\nList of doctors " + d.doctorPrint());
        }
        for (InsuranceCompanies ins : acceptedInsurance) {
            System.out.println("\nHospital accepts following insurances: " + "\n" + ins);
        }
        for (Map.Entry<Integer, String> pair : rooms.entrySet()) {
            System.out.println("\nList of Rooms of Children's Mercy Hospital: " + pair.getKey() + ": " + pair.getValue());
        }
    }
}





  







