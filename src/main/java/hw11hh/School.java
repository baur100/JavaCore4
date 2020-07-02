package hw11hh;

import java.util.Arrays;

public class School {
    private String district;
    private String name;
    private Supplies supplies;
    private String [] teachers;

    public School(String district, String name, Supplies supplies, String[] teachers) {
        this.district = district;
        this.name = name;
        this.supplies = supplies;
        this.teachers = teachers;
    }

    public School() {
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supplies getSupplies() {
        return supplies;
    }

    public void setSupplies(Supplies supplies) {
        this.supplies = supplies;
    }

    public String[] getTeachers() {
        return teachers;
    }

    public void setTeachers(String[] teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "School{" +
                "district='" + district + '\'' +
                ", name='" + name + '\'' +
                ", supplies=" + supplies +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }

    public void printSchoolInfo() {
        System.out.println(toString());;
    }
}
