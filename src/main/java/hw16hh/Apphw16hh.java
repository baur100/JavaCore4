package hw16hh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apphw16hh {
    public static void main(String[] args) {
        Address brooklynHosAdd = new Address("121 DeKalb Ave", "Brooklyn", "NY", 11201);

        Doctor guillaume = new Doctor("Melissa", "Guillaume", Title.CARDIOLOGIST);
        Doctor abraham = new Doctor("Maria", "Abraham", Title.PEDIATRICIAN);
        Doctor chai = new Doctor("Edward", "Chai", Title.NEUROLOGIST);
        Doctor burger = new Doctor("Steven", "Burger", Title.SURGEON);
        Doctor cuevas = new Doctor("Juana", "Cuevas", Title.OBGYN);


        List<Doctor> brooklynDoc = new ArrayList<>();
        brooklynDoc.add(guillaume);
        brooklynDoc.add(abraham);
        brooklynDoc.add(chai);
        brooklynDoc.add(burger);
        brooklynDoc.add(cuevas);

        Map<Integer, String> brooklynRooms = new HashMap<>();
        brooklynRooms.put(806, "Geriatrics");
        brooklynRooms.put(311, "Critical Care");
        brooklynRooms.put(220, "Infectious Disease");
        brooklynRooms.put(1109, "General Surgery");
        brooklynRooms.put(612, "Pediatrics");

        List<InsCo> brooklynIns = new ArrayList<>();
        brooklynIns.add(InsCo.AETNA);
        brooklynIns.add(InsCo.UNITED);
        brooklynIns.add(InsCo.CIGNA);
        brooklynIns.add(InsCo.BLUECROSS);
        brooklynIns.add(InsCo.EMBLEM);
        brooklynIns.add(InsCo.KAISER);

        Hospital brooklynHos = new Hospital("Brooklyn Hospital", brooklynHosAdd, brooklynDoc, brooklynRooms, brooklynIns);

        System.out.println(brooklynHos.toString());
    }
}
