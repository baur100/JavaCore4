package hw16;

import java.nio.channels.UnresolvedAddressException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

public class Hospital {

    public static void main(String[] args) {

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(22, "Gastroetrology");
        rooms.put(23, "Pediathry");
        rooms.put(24, "Surgery");
        rooms.put(26, "Emergency");

        ArrayList<InsuranceCompanies > acceptedInsuranses = new ArrayList<InsuranceCompanies>();
        acceptedInsuranses.add(InsuranceCompanies.COSTCO);
        acceptedInsuranses.add(InsuranceCompanies.BLU_CROSS);
        acceptedInsuranses.add(InsuranceCompanies.GEICO);

        Doctor number1 = new Doctor("Bob", "Smith", Position.PEDIATOR, InsuranceCompanies.GEICO );
        Doctor number2 = new Doctor("Alex", "Marvin", Position.SURGEON, InsuranceCompanies.BLU_CROSS);
        Doctor number3 = new Doctor( "Ana", "Silva", Position.NURSE, InsuranceCompanies.WALLMART);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(number1);
        doctors.add(number2);
        doctors.add(number3);


        System.out.println(acceptedInsuranses);
        System.out.println(rooms);
        System.out.println();

    }


}

