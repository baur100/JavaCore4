package HW16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Address a1 = new Address("1st Street", "Los Angeles", "CA", 90023);
        List<Doctor> doctors = new ArrayList<Doctor>();

        Doctor James = new Doctor("james","stewart",Position.ONCOLOGIST);
        Doctor Sammy = new Doctor("Sammy","Ling",Position.PHYSICIAN);
        doctors.add(James);
        doctors.add(Sammy);

        HashMap<Integer, String> rooms = new HashMap<Integer, String>();

        rooms.put(101,"Radiology");
        rooms.put(102,"Oncology");
        rooms.put(103,"Surgery");
        rooms.put(104,"Cardiology");

        System.out.println(rooms);

        ArrayList<InsuranceCompanies> insurance = new ArrayList<InsuranceCompanies>();
        insurance.add(InsuranceCompanies.Lacare);
        insurance.add(InsuranceCompanies.UnitedHealthcare);

        Hospital StFrancis = new Hospital("StFrancis",a1,doctors,rooms,insurance);
        StFrancis.PrintDoctor();

    }
}
