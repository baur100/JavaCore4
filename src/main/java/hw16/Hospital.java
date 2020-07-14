package hw16;

import java.nio.channels.UnresolvedAddressException;
import java.util.*;

public class Hospital {

    public static void main(String[] args) {

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(22, "Gastroetrology");
        rooms.put(23, "Pediathry");
        rooms.put(24, "Surgery");
        rooms.put(26, "Emergency");

        ArrayList<InsuranceCompanies> acceptedInsuranses = new ArrayList<InsuranceCompanies>();
        acceptedInsuranses.add(InsuranceCompanies.COSTCO);
        acceptedInsuranses.add(InsuranceCompanies.BLU_CROSS);
        acceptedInsuranses.add(InsuranceCompanies.GEICO);


        System.out.println(acceptedInsuranses);
        System.out.println(rooms);


        Doctor number1 = new Doctor("Bob ", "Smith ", Position.PEDIATOR, InsuranceCompanies.GEICO);
        Doctor number2 = new Doctor("Alex ", "Marvin ", Position.SURGEON, InsuranceCompanies.BLU_CROSS);
        Doctor number3 = new Doctor("Ana ", "Silva ", Position.NURSE, InsuranceCompanies.WALLMART);


        List<Doctor> doctorsList = new ArrayList<>();
        doctorsList.add(number1);
        doctorsList.add(number2);
        doctorsList.add(number3);


        for(int i =0; i<doctorsList.size(); i++){
            doctorsList.get(i).doctorPrint();
        }

        number1.doctorPrint();
        number2.doctorPrint();
        number3.doctorPrint();


//        System.out.println(Arrays.toString(doctorsList.toArray()));
//
//        doctorsList.size();
//

   }

    }

