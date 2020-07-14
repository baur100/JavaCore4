package HW18;

import java.util.List;

public class Doctor {
    private String name;
    private String lastName;
    private List<Title> titles;

    public Doctor(String name, String lastName, List<Title> titles) {
        this.name = name;
        this.lastName = lastName;
        this.titles = titles;
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

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }
    public void printDoctors(){
        System.out.println("Doctor's name : " + name + "\nDoctor's last name : " + lastName + "\nTitle : " + Title.DENTIST);
    }
}

