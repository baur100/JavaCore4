package Hw16;

import java.util.Arrays;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;
    private InsuranceCompanies insuranceAccepted;

    public Doctor (String name, String lastName, Position position, InsuranceCompanies insuranceAccepted){
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.insuranceAccepted = insuranceAccepted;
    }

public void doctorPrint() {
    System.out.println("Doctor's name: " + name + " " + lastName);
    System.out.println("\nDoctor's position:  " + position);
    System.out.println("\nDoctor " + lastName + " accepts" + insuranceAccepted);
}
}
