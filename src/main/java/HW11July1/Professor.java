package HW11July1;

import java.util.Arrays;

public class Professor {
    private String proFirstName;
    private String proLastName;
    private String[] coursesHandled;
    private String universityName;
    Courses coursesOffered;

    public Professor(){}

    public Professor(String proFirstName, String proLastName, String[] coursesHandled, String universityName, Courses coursesOffered) {
        this.proFirstName = proFirstName;
        this.proLastName = proLastName;
        this.coursesHandled = coursesHandled;
        this.universityName = universityName;
        this.coursesOffered = coursesOffered;
    }

    public String getProFirstName() { return proFirstName; }
    public void setProFirstName(String proFirstName) { this.proFirstName = proFirstName; }

    public String getProLastName() { return proLastName; }
    public void setProLastName(String proLastName) { this.proLastName = proLastName; }

    public String[] getCoursesHandled() { return coursesHandled; }
    public void setCoursesHandled(String[] coursesHandled) { this.coursesHandled = coursesHandled; }

    public String getUniversityName() { return universityName; }
    public void setUniversityName(String universityName) { this.universityName = universityName; }

    public Courses getCoursesOffered() { return coursesOffered; }
    public void setCoursesOffered(Courses coursesOffered) { this.coursesOffered = coursesOffered; }

    public void printInfo(){

        System.out.println("Professor{" +
                    "proFirstName='" + proFirstName + '\'' +
                    ", proLastName='" + proLastName + '\'' );

        for (String pc:this.coursesHandled) { System.out.println(pc); }

        System.out.println("universityName= '" + universityName );
        this.coursesOffered.printInfo();
    }

    public void printProfInfo() {
        System.out.println("Professor{" +
                "proFirstName='" + proFirstName + '\'' +
                ", proLastName='" + proLastName + '\'' +
                ", coursesHandled=" + Arrays.toString(coursesHandled) +
                ", universityName='" + universityName + '\'' +
                '}');
        this.coursesOffered.printInfo();
    }




}
