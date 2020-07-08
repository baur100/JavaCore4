package HW12;

public class Programmer extends ItSpecialist{

    protected int salary;

    public Programmer(String name, String lastName, String position, int salary) {
        super(name, lastName, position);
        this.salary=salary;

    }

    public Programmer() {}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int city) {

        this.salary = salary;
    }

    public void printProgrammerInfo() {
        super.printItSpecialistInfo();
        System.out.println("Programmer: " + "salary: " + salary);
    }
}

