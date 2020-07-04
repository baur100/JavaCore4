package Hw11;

import l11.Address;

public class Doctor {
    private String name;
    private String lastName;
    private String[] services;
    private String specialty;
    Hospital hospital;

    public Doctor(String name, String lastName, String[] services, String specialty, Hospital hospital) {
        this.name = name;
        this.lastName = lastName;
        this.services = services;
        this.specialty = specialty;
        this.hospital = hospital;
    }

    public Doctor() {
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.lastName);
        System.out.println(this.specialty);
        for (String v : this.services) {
            System.out.println(v);
        }
//        System.out.println(this.address);
//        this.address.printAddress();
        System.out.println(this.hospital.getAddressLine());
        System.out.println(this.hospital.getCity());
        System.out.println(this.hospital.getState());
        System.out.println(this.hospital.getZip());
    }
}
