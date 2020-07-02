package hw10;

public class test {


 private String name;
 private String[] subjects;
    private String major;

    public test(String name, String[] subjects, String major) {
        this.name = name;
        this.subjects = subjects;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
