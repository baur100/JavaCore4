package HW11July1;

import java.util.Arrays;

public class Courses {

    //    private String[][] courseNamesPerSemesterwithCreditPoints;
    private String[] courseNames;
    private String semesterNumber;
    private boolean onlineCourse = true;
    private double courseFee;
    private double creditPoints;

    public Courses(){}

    public Courses(String[] courseNames, String semesterNumber, boolean onlineCourse, double courseFee, double creditPoints) {
        //this.courseNamesPerSemesterwithCreditPoints = courseNamesPerSemesterwithCreditPoints;
        this.courseNames = courseNames;
        this.semesterNumber = semesterNumber;
        this.onlineCourse = onlineCourse;
        this.courseFee = courseFee;
        this.creditPoints = creditPoints;
    }

    /*public String[][] getCourseNamesPerSemesterwithCreditPoints() { return courseNamesPerSemesterwithCreditPoints; }
    public void setCourseNamesPerSemesterwithCreditPoints(String[][] courseNamesPerSemesterwithCreditPoints) { this.courseNamesPerSemesterwithCreditPoints = courseNamesPerSemesterwithCreditPoints; }
*/

    public String[] getCourseNames() { return courseNames; }
    public void setCourseNames(String[] courseNames) { this.courseNames = courseNames; }

    public String getSemesterNumber() { return semesterNumber; }
    public void setSemesterNumber(String semesterNumber) { this.semesterNumber = semesterNumber; }

    public boolean isOnlineCourse() { return onlineCourse; }
    public void setOnlineCourse(boolean onlineCourse) { this.onlineCourse = onlineCourse; }

    public double getCourseFee() { return courseFee; }
    public void setCourseFee(double courseFee) { this.courseFee = courseFee; }

    public double getCreditPoints() { return creditPoints; }
    public void setCreditPoints(double creditPoints) { this.creditPoints = creditPoints; }

    public void printInfo() {
        System.out.println("Courses");
        for (String c : this.courseNames) {
            System.out.println(c);
        }
        System.out.println("Courses{ \n" +
                "semesterNumber='" + semesterNumber + '\'' +
                ", onlineCourse=" + onlineCourse +
                ", courseFee=" + courseFee +
                ", creditPoints=" + creditPoints +
                '}');
    }


}
