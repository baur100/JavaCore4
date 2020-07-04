package HW11July1;

import java.util.Arrays;

public class Courses {

    private String[] courseNames;
    private String semesterNumber;
    private boolean onlineCourse;
    private double courseFee;
    private double creditPoints;
    private String universityName;

    public Courses(){}

    public Courses(String[] courseNames, String semesterNumber, boolean onlineCourse, double courseFee, double creditPoints, String universityName) {
        //this.courseNamesPerSemesterwithCreditPoints = courseNamesPerSemesterwithCreditPoints;
        this.courseNames = courseNames;
        this.semesterNumber = semesterNumber;
        this.onlineCourse = onlineCourse;
        this.courseFee = courseFee;
        this.creditPoints = creditPoints;
        this.universityName = universityName;
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


    public String getUniversityName() { return universityName; }
    public void setUniversityName(String universityName) { this.universityName = universityName; }

    public void printCourseInfo() {
        System.out.println("Courses: ");
        for (String c : this.courseNames) {
            System.out.print(c+' ');
        }
        System.out.println("\n{" +
                "semesterNumber='" + semesterNumber + '\'' +
                ", onlineCourse=" + onlineCourse +
                ", courseFee=" + courseFee +
                ", creditPoints=" + creditPoints +
                '}');
    }


}
