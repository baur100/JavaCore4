package HW11July1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Student {
    private String studFirstName;
    private String studLastName;
    private String[] coursesEnrolled;
    private int SemesterNumber;
    private double feeDue;
    private boolean courseOptedOnline;
    private Courses coursesAvailable;

//    Non-parameterized Constructor defined explicitly as default constructor cannot be accessed with an existing constructor
    public Student(){}

//    Fully Parameterized Constructor
    public Student(String studFirstName, String studLastName, String[] coursesEnrolled, int semesterNumber, double feeDue, boolean courseOptedOnline, Courses coursesAvailable) {
        this.studFirstName = studFirstName;
        this.studLastName = studLastName;
        this.coursesEnrolled = coursesEnrolled;
        SemesterNumber = semesterNumber;
        this.feeDue = feeDue;
        this.courseOptedOnline = courseOptedOnline;
        this.coursesAvailable = coursesAvailable;
    }

    public String getStudFirstName() { return studFirstName; }
    public void setStudFirstName(String studFirstName) { this.studFirstName = studFirstName; }

    public String getStudLastName() { return studLastName; }
    public void setStudLastName(String studLastName) { this.studLastName = studLastName; }

    public String[] getCoursesEnrolled() { return coursesEnrolled; }
    public void setCoursesEnrolled(String[] coursesEnrolled) { this.coursesEnrolled = coursesEnrolled; }

    public int getSemesterNumber() { return SemesterNumber; }
    public void setSemesterNumber(int semesterNumber) { SemesterNumber = semesterNumber; }

    public double getFeeDue() { return feeDue; }
    public void setFeeDue(double feeDue) { this.feeDue = feeDue; }

    public Courses getCoursesAvailable() { return coursesAvailable; }
    public void setCoursesEnrolled(Courses coursesAvailable) { this.coursesAvailable = coursesAvailable; }

    public void printStudInfo() {
        int i = 0;
        System.out.println("Student{" +
                "studFirstName='" + studFirstName + '\'' +
                ", studLastName='" + studLastName );
        System.out.println(" Courses Enrolled: ");
        for (String studCourse : coursesEnrolled) {
            for (String availCourse : this.coursesAvailable.getCourseNames()) {
                if(studCourse == availCourse) {
                    System.out.print(studCourse+", ");
                    i++;
                }
            }
        }
        System.out.println();
        System.out.println("SemesterNumber=" + SemesterNumber +
                ", feeDue=" + feeDue +
                ", courseOptedOnline = " +courseOptedOnline + ' '+'}' );
        if(i==coursesEnrolled.length) System.out.println("All the courses enrolled by the student "+studFirstName+' '+studLastName+", are available in the prefered university "+this.coursesAvailable.getUniversityName());
    }

}
