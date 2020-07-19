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

public String doctorPrint() {
    return "Doctor's name: " + name + " " + lastName +
            "\nDoctor's position:  " + position +
            "\nDoctor " + lastName + " accepts" + insuranceAccepted;
}
}
