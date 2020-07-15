package hw18;

import l14.Person;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppHW18 {

    public static void main(String[] args) {

        try {
        Address childrenHospitalAdd = new Address("123 Sunset Blvd", "Los Angelses",
                "CA", 90032);


        List<Doctor> childrenDoctor = new ArrayList<Doctor>();
        Doctor cruz = new Doctor("Tom", "Cruz", Position.NEUROLOGISTS);
        childrenDoctor.add(cruz);
        cruz.printDoctor();

        Doctor cube = new Doctor("Ice", "Cube", Position.DERMATOLOGISTS);
        childrenDoctor.add(cube);
        cube.printDoctor();


        Doctor nasir = new Doctor("Azm", "Nasir", Position.ONCOLOGISTS);
        childrenDoctor.add(nasir);
        cube.printDoctor();

        Doctor mobin = new Doctor("Sidra", "Mobin", Position.CARDIOLOGISTS);
        childrenDoctor.add(mobin);
        mobin.printDoctor();

        Doctor crystal = new Doctor("Luna ", "Crystal", Position.PEDIATRICIANS);
        childrenDoctor.add(crystal);
        crystal.printDoctor();
        System.out.println("**************");



        HashMap<Integer, String> rooms = new HashMap<Integer, String>();
        rooms.put(101, "PEDIATRICIANS");
        rooms.put(105, "ONCOLOGISTS");
        rooms.put(110, "DERMATOLOGISTS");
        rooms.put(115, "CARDIOLOGISTS");
        rooms.put(120, "NEUROLOGISTS");

        for (Map.Entry<Integer, String> pair : rooms.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println("**************");


        List<Insurance> childrenInsurance = new ArrayList<Insurance>();
        childrenInsurance.add(Insurance.AETNA);
        childrenInsurance.add(Insurance.MOLINAHEALTHCARE);
        childrenInsurance.add(Insurance.UNITEDHEALTHCARE);
        childrenInsurance.add(Insurance.BLUESHIELD);
        childrenInsurance.add(Insurance.CIGNA);


        Hospital childrenHospital = new Hospital("Children Hospital of Los Angeles",
                childrenHospitalAdd, childrenDoctor, rooms, (ArrayList<Insurance>) childrenInsurance);
        childrenHospital.printHospital();
        System.out.println("**************");
        System.out.println(rooms);
        System.out.println("**************");



        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

