package HW16;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.print.Doc;
import java.util.*;

public class App {
    public static void main(String[] args) {

// Rooms added to the HashMap:
        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(13, "Consulting Room");
        rooms.put(3, "Emergency Room");
        rooms.put(42, "Surgery");
        rooms.put(21, "Odservation");
        rooms.put(10, "X-ray");
        rooms.put(16, "Cardiology");

//Address created:
        Address address = new Address("112 Carlton Dr", "Chicago", "IL", 45609);

// Doctors objects created:
        Doctor bykov = new Doctor("Andrei", "Bykov", Position.CARDIOLOGIST);

        Doctor johns = new Doctor();
        johns.setName("Sam");
        johns.setLastName("Johns");
        johns.setPosition(Position.OPTOMETRIST);

        Doctor nisigawa = new Doctor();
        nisigawa.setName("Katano");
        nisigawa.setLastName("Nisigawa");
        nisigawa.setPosition(Position.SURGEON);

// Doctors added to the List doctors:
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Gregory", "House", Position.PHYSICIAN));
        doctors.add(bykov);
        doctors.add(nisigawa);
        doctors.add(johns);

// Insurance Companies added to the ArrayList from the Enum:
        ArrayList<InsuranceCompanies> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add (InsuranceCompanies.UNITEDHEALTHCARE);
        acceptedInsurances.add (InsuranceCompanies.CIGNA);
        acceptedInsurances.add (InsuranceCompanies.EHEALTH);


// New hospital created:
        Hospital chicagoHealth = new Hospital("Chicago Health", address, doctors, rooms, acceptedInsurances);

        chicagoHealth.printHospitalInfo();

        System.out.println("****************");

        chicagoHealth.printDoctors();

        System.out.println("****************");

        chicagoHealth.printRooms();

    }

}

