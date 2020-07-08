package HW12;

public class Employee {
    protected String name;
    protected String lastName;
    protected String job;

    public Employee(String name, String lastName, String job) {
        this.name = name;
        this.lastName = lastName;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
