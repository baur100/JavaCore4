package l13;

public class Student extends Person {
    private String major;
    private String[] subjects;

    public Student(Name name, Address address, String major, String[] subjects) {
        super(name, address);
        this.major = major;
        this.subjects = subjects;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}
