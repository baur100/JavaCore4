package HW12;

public class EntryLevelEmployees extends Employee {
    private String Department;

    public EntryLevelEmployees(String employeeName, int employeeID, String employeeRole, String Department) {
        super(employeeName, employeeID, employeeRole);
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }
}

