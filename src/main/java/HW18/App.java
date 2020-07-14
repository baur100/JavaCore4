package HW18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address hospitalAddress = new Address("123 Test St", "New York", "NY", 52133);

        List<Title> titles = new ArrayList<>();
        titles.add(Title.DENTIST);

        List<Doctor> doctors = new ArrayList<>();
        Doctor victor = new Doctor("Victor", "frankenstein", titles);
        doctors.add(victor);

        Hospital medicalCenter = new Hospital("Medical Center", hospitalAddress, doctors);

        Map<Integer,String> rooms = new HashMap<Integer,String>();
        rooms.put(111, "Dentistry");
        rooms.put(112, "Dermatology");
        rooms.put(113, "Cardiology");
        rooms.put(114, "Urgent care");
        rooms.put(115, "Surgery");

        List<InsuranceCompanies> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(InsuranceCompanies.ALLSTATE);
        acceptedInsurances.add(InsuranceCompanies.PROGRESSIVE);
        acceptedInsurances.add(InsuranceCompanies.GEICO);
        acceptedInsurances.add(InsuranceCompanies.METLIFE);


        medicalCenter.hospitalInfo();
        hospitalAddress.printAddress();
        victor.printDoctors();
        for (Map.Entry<Integer,String> x: rooms.entrySet()){
            int c = x.getKey();
            String p = x.getValue();
            System.out.println(c+ " : " + p);
        }
        System.out.println(acceptedInsurances);









    }
}
