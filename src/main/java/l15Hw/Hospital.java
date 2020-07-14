package l15Hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompany> acceptedInsurances;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompany> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public ArrayList<InsuranceCompany> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void getInfo() {
        System.out.println("Hospital: " + this.hospitalName);
        this.address.getAddress();
        System.out.println("Doctors list:");
        doctors.forEach(v -> System.out.println(v.getPosition() + ": "+ v.getName() + " " + v.getLastName()  ));
        System.out.println("Cabinets numbers:");
        for (Map.Entry<Integer, String> pair : rooms.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println("Accepted Insurance Companies list:");
        acceptedInsurances.forEach(v-> System.out.println(v));


    }
}

