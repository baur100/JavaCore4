package Homework12;

public class Warriors extends Basketball{
    private String hometown;
    private String college;

    public Warriors(String name, String lastName, String city, String championships, String hometown, String college) {
        super(name, lastName, city, championships);
        this.hometown = hometown;
        this.college = college;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void printWarriorInfo(){
        System.out.println("First Name = "+name+" Last Name = "+lastName+" Team City = "+city+" Number of rings = "+championships+" Hometown = "+hometown+" College = "+college);
    }
}
