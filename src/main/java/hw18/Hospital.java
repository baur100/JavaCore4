package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List <Doctor> doctors;
    private HashMap <Integer,String> rooms;
    private ArrayList <Insurance> acceptedInsurance;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors,
                    HashMap<Integer, String> rooms,
                    ArrayList<Insurance> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
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

    public ArrayList<Insurance> getAcceptedInsurance() {
        return acceptedInsurance;
    }

    public void setAcceptedInsurance(ArrayList<Insurance> acceptedInsurance) {
        this.acceptedInsurance = acceptedInsurance;
    }

    //    public String hospitalInfo(){
//        return "\n" + "Hospital: " + hospitalName +
//                "\n" + address //.addressInfo()
//                + "\n****************" +
//                "\nDoctor: " + doctors +
//                "\n****************" +
//                "\nRooms: " + rooms +
//                "\n****************" +
//                "\nAcceptInsurace: " + acceptedInsurance;
//
//    }


    public void printHospital(){
        System.out.println(this.hospitalName);
        address.printAddress();
        for (Doctor doc: doctors) {
            System.out.println(doc.getName() + " " + doc.getLastName() +
                    " " + doc.getPosition());
            System.out.println(this.rooms);
            System.out.println("Hospital Accepted" +this.acceptedInsurance);
            System.out.println("***********************");

        }
//        System.out.println(hospitalInfo());
    }


}
