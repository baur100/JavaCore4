package hw11hh;

import java.util.Arrays;

public class Classroom {
    private String number;
    private String[] students;
    private Teacher teacher;
    private int floor;

    public Classroom(String number, String[] students, Teacher teacher, int floor) {
        this.number = number;
        this.students = students;
        this.teacher = teacher;
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void printClassroom() {
        System.out.println("Class: "+number+" Floor: "+floor+
                "\n"+teacher+
                "\nStudents: "+ Arrays.toString(students));
    }
}
