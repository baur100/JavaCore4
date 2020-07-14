package HomeWork16July11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Create class Hospital
Fields
- private String hospitalName;
- privare Address address;
    (Class Address
    - private String streetAddress;
    - private String town;
    - private String state;
    - private int zip;
- private List<Doctor> doctors;
    (Class Doctor
    - private String name;
    - private String lastName;
    - private Position position;
    (Enum Title is a enum with 5 members - for example Position.PHYSICIAN);
- private HashMap<Integer,String> rooms; (list of rooms and their names - for example room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
- private ArrayList<InsuranseCompamies> acceptedInsuranses; list of accepted insurance.
    (Enum InsuranseCompamies - enum of Insuranses,  for example InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
Methods:
- Printout hospital with ALL fields
- Printout Doctors and their titles; public void printDoctors();
- Printout rooms

*/

public class HW16MainClass {
    public static void main(String[] args) {

        Address add1 = new Address("112 Hollow St","Milpitas","TN",98764,true);
        Address add2 = new Address("984 Sherin St","Square Town","AZ",98649,true);
        Address add3 = new Address("456 Able St","qwerty","TN",64453,true);
        Address add4 = new Address("302 Berryessa St","Fremont","CA",12435,true);
        Address add5 = new Address("643 Elan Village Ln","San Diego","OR",24553,true);
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(add1);
        addresses.add(add2);
        addresses.add(add3);
        addresses.add(add4);
        addresses.add(add5);

         Doctor d1 = new Doctor("Sladen","Paul",Title.PHYSICIAN );
         Doctor d2 = new Doctor("Kayden","Klein",Title.PHYSICIAN );
         Doctor d3 = new Doctor("Neil","Chandelier",Title.PHYSICIAN );
         Doctor d4 = new Doctor("Dev","Krish",Title.PHYSICIAN );
         Doctor d5 = new Doctor("Sladen","Peter",Title.PHYSICIAN );
         List<Doctor> doctors = new ArrayList<Doctor>();
         doctors.add(d1);
         doctors.add(d2);
         doctors.add(d3);
         doctors.add(d4);
         doctors.add(d5);

        HashMap<Integer,String> rooms = new HashMap<Integer, String>();
        rooms.put(22,"Gastroenterology");
        rooms.put(32,"Ophthamology");
        rooms.put(2,"Psychology");
        rooms.put(15,"Orthology");
        rooms.put(8,"Neurology");


        ArrayList<InsuranceCompanies> acceptedInsurances = new ArrayList<InsuranceCompanies>();
        acceptedInsurances.add(0,InsuranceCompanies.AETNA);
        acceptedInsurances.add(0,InsuranceCompanies.AFLAC);
        acceptedInsurances.add(0,InsuranceCompanies.BLUE_SHIELD);
        acceptedInsurances.add(0,InsuranceCompanies.ESURANCE);
        acceptedInsurances.add(0,InsuranceCompanies.GAINSCO);
        acceptedInsurances.add(0,InsuranceCompanies.GEICO);
        acceptedInsurances.add(0,InsuranceCompanies.IRONSHORE);
        acceptedInsurances.add(0,InsuranceCompanies.METROMILE);
        acceptedInsurances.add(0,InsuranceCompanies.METLIFE);
        acceptedInsurances.add(0,InsuranceCompanies.OMEGA);
        acceptedInsurances.add(0,InsuranceCompanies.PEMVO);
        acceptedInsurances.add(0,InsuranceCompanies.PRIMERICA);
        acceptedInsurances.add(0,InsuranceCompanies.UNITED_HEALTH_CARE);


        //String hospitalName, Address address, Doctor doc, HashMap<Integer, String> room, ArrayList<InsuranceCompanies> acceptedInsurance
        Hospitals h1 = new Hospitals("ABC Hospital",addresses,doctors,rooms,acceptedInsurances);
        h1.printHsptlInfo();

    }
}
