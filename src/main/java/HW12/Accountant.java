package HW12;

public class Accountant extends Employee {
    private int salaryPerYear;

    public Accountant(String name, String lastName, String job, int salaryPerYear) {
        super(name, lastName, job);
        this.salaryPerYear = salaryPerYear;
    }

    public void getAccInfo(){
        System.out.println("Employee name= " + name + "\nEmployee last name= " + lastName + "\nJob= " + job + "\nSalary per year = " + salaryPerYear);
    }
}
