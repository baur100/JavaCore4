package HW18;

import HW17.Cars;
import HW17.Homes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        Address addressA = new Address("50 Ocean Ave", "Santa Monica", "CA", 90245);

        Doctor drgeorge = new Doctor("George", "Cooper", Position.PEDIATRICIAN);
        Doctor drmichael = new Doctor("Michael", "Cruise", Position.CARDIOLOGIST);
        Doctor drvanessa = new Doctor("Vanessa", "Durand", Position.RADIOLOGIST);
        Doctor drkevin = new Doctor("Kevin", "Hansen", Position.PHYSICIAN);

        List<Doctor> doctors= new ArrayList<Doctor>();
        doctors.add(drgeorge);
        doctors.add(drmichael);
        doctors.add(drvanessa);
        doctors.add(drkevin);


        Map<Integer, String> rooms = new HashMap<Integer, String>();
        rooms.put(10, "Delivery");
        rooms.put(5, "ICU");
        rooms.put(33, "Cardiology");
        rooms.put(22, "Lab");

        ArrayList<InsuranceCompanies> acceptedInsurances = new ArrayList<InsuranceCompanies>();
        acceptedInsurances.add(InsuranceCompanies.AETNA);
        acceptedInsurances.add(InsuranceCompanies.BLUECROSS);
        acceptedInsurances.add(InsuranceCompanies.HEALTHNET);

        Hospital cedars = new Hospital("Cedars Sinai\n",addressA, doctors, rooms, acceptedInsurances);
        System.out.println("*********************" + cedars.getHospitalName());
        System.out.println(cedars.getAddress().printAddressInfo());

        System.out.println("\nHere are the Doctors working in this hospital:");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(doctors.get(i).printDoctorInfo());
        }

        System.out.println("\nHere are the rooms in the hospital");

        for (Map.Entry<Integer, String> x: rooms.entrySet()){
            Integer h=x.getKey();
            String c=x.getValue();
            System.out.println(h+ "=>" + c);



        }
        System.out.println("\nHere are the insurances offered in this hospital");

        for (int j = 0; j < acceptedInsurances.size(); j++) {
            System.out.println(acceptedInsurances.get(j).toString());
        }


    }
}
