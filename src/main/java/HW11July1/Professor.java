package HW11July1;

import java.util.Arrays;

public class Professor {
    private String proFirstName;
    private String proLastName;
    private String[] coursesHandled;
    private boolean isCourseOnline;
    private Courses coursesOffered;

    public Professor() { }

    public Professor(String proFirstName, String proLastName, String[] coursesHandled, boolean isCourseOnline, Courses coursesOffered) {
        this.proFirstName = proFirstName;
        this.proLastName = proLastName;
        this.coursesHandled = coursesHandled;
        this.isCourseOnline = isCourseOnline;
        this.coursesOffered = coursesOffered;
    }

    public String getProFirstName() { return proFirstName; }
    public void setProFirstName(String proFirstName) { this.proFirstName = proFirstName; }

    public String getProLastName() { return proLastName; }
    public void setProLastName(String proLastName) { this.proLastName = proLastName; }

    public String[] getCoursesHandled() { return coursesHandled; }
    public void setCoursesHandled(String[] coursesHandled) { this.coursesHandled = coursesHandled; }

    public boolean isCourseOnline() { return isCourseOnline; }
    public void setCourseOnline(boolean courseOnline) { isCourseOnline = courseOnline; }

    public Courses getCoursesOffered() { return coursesOffered; }
    public void setCoursesOffered(Courses coursesOffered) { this.coursesOffered = coursesOffered; }

    public void printProfInfo() {
        System.out.println("Professor. {" + proFirstName + " " + proLastName +

                 ", Courses are Offered Online: "+ isCourseOnline + '}');
        int i = 0;
        System.out.println("Courses Handled");
        for (String v : coursesHandled) {
            for (String u : this.coursesOffered.getCourseNames()) {
                if (u == v) {
                    System.out.println(v);
                    i++;
                }
            }
        }
        boolean check = i == coursesHandled.length;
        if(check)System.out.println("All the courses handled by Prof."+proFirstName+' '+proLastName+", are offered by "+this.coursesOffered.getUniversityName()+" school.");
        else System.out.println("There is a mismatch in the courses available in the " + this.coursesOffered.getUniversityName() + " university and the courses offered by the Prof."+proFirstName+' '+proLastName+". \nPlease check with the professor for further details on this.");
    }

}
