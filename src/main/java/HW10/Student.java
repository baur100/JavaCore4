package HW10;

public class Student {
    private String StudentName;
    private char Grade;
    private String Course;

    public Student(String StudentName, char Grade, String Course ){
        this.StudentName=StudentName;
        this.Grade=Grade;
        this.Course=Course;
    }

    public Student(){}

    public void printInfo(){
        System.out.println("Student: "+StudentName+"\nReceived a Grade of: " + Grade+"\nClass Name:  "+ Course );
    }

    public void setStudentName(String StudentName){
        this.StudentName = StudentName;
    }

    public String getStudentName(){
        return StudentName;
    }

    public void setGrade(char Grade){
        this.Grade= Grade;
    }

    public char getGrade(){
        return Grade;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getCourse() {
        return Course;
    }

}
