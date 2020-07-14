package l15Hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(21, "SURGEON");
        rooms.put(22, "CARDIOLOGIST");
        rooms.put(23, "DERMATOLOGIST");
        rooms.put(24, "PEDIATRICIAN");
        rooms.put(25, "NEUROLOGIST");


        Address hospitalAddress = new Address("1039 Coleman Rd", "Salt Lake", "AR", 22345);

        Doctor robertR = new Doctor("Robert", "Rich", Position.CARDIOLOGIST);
        Doctor liviaS = new Doctor("Livia", "Sarep", Position.DERMATOLOGIST);
        Doctor soniaK = new Doctor("Sonia", "Kun", Position.NEUROLOGIST);
        Doctor lenaV = new Doctor("Lena", "Volkova", Position.SURGEON);
        Doctor faridA = new Doctor("Farid", "Anar", Position.PEDIATRICIAN);


        List<Doctor> doctors = new ArrayList<>();
        doctors.add(robertR);
        doctors.add(liviaS);
        doctors.add(soniaK);
        doctors.add(lenaV);
        doctors.add(faridA);


        ArrayList<InsuranceCompany> insuranceCompanies = new ArrayList<>();
        insuranceCompanies.add(InsuranceCompany.BEWELL);
        insuranceCompanies.add(InsuranceCompany.HEALTHMARKET);
        insuranceCompanies.add(InsuranceCompany.UNITED);
        insuranceCompanies.add(InsuranceCompany.HYATT);


        Hospital mediClub = new Hospital("MediClub", hospitalAddress, doctors, rooms, insuranceCompanies);
        mediClub.getInfo();

    }
}