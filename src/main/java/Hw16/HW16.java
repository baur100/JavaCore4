package Hw16;

import java.util.HashMap;

public class HW16 {
    public static void main(String[] args) {

//        Create class Hospital
//Fields
//        - private String hospitalName;
//        - privare Address address;
//        (Class Address
//                - private String streetAddress;
//        - private String town;
//        - private String state;
//        - private int zip;
//        - private List<Doctor> doctors;
//        (Class Doctor
//                - private String name;
//        - private String lastName;
//        - private Position position;
//        (Enum Title is a enum with 5 members - for example Position.PHYSICIAN);
//        - private HashMap<Integer,String> rooms; (list of rooms and their names - for example room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//        - private ArrayList<InsuranseCompamies> acceptedInsuranses; list of accepted insurance.
//        (Enum InsuranseCompamies - enum of Insuranses,  for example InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//        Methods:
//        - Printout hospital with ALL fields
//        - Printout Doctors and their titles; public void printDoctors();
//        - Printout rooms




        HashMap<Integer, String> rooms = new HashMap<Integer, String>();
        rooms.put(120, "Surgery");
        rooms.put(130, "Dentistry");
        rooms.put(140, "Cardiology");
        rooms.put(150, "Gynecology");
        rooms.put(160, "Pediatry");
        rooms.put(170, "Otolaringology");
        rooms.put(180, "Neurology");




    }
}
