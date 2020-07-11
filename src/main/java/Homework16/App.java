package Homework16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Address uscAddress = new Address("2051 Marengo St", "Los Angeles", "California", 90033);

        List<Doctor> doctors = new ArrayList<Doctor>();
        Doctor haeseong = new Doctor("Haeseong","Lee",Position.SURGEON);
        doctors.add(haeseong);

        Doctor patrick = new Doctor("Patrick", "Seng",Position.RADIOLOGIST);
        doctors.add(patrick);

        HashMap<Integer, String> rooms = new HashMap<Integer, String>();
        rooms.put(1,"Surgery Room");
        rooms.put(2,"Radiology Room");
        rooms.put(3,"Emergency Room");
        rooms.put(4,"Delivery Room");

        List<InsuranceCompanies> insurance = new ArrayList<InsuranceCompanies>();
        insurance.add(InsuranceCompanies.KAISER);
        insurance.add(InsuranceCompanies.UNITEDHEALTH);

        Hospital uscHospital = new Hospital("USC Medical Center", uscAddress, doctors, rooms, (ArrayList<InsuranceCompanies>) insurance);
        uscHospital.printInfo();

        System.out.println(rooms);

        System.out.println("**********************************");

        haeseong.printDoctors();
        patrick.printDoctors();
        }
    }
