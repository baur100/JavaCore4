package HW12;

public class ExecutiveEmployees extends Employee {
    private String Department;

    public ExecutiveEmployees(String EmployeeName,int employeeID, String employeeRole,String Department) {
        super(EmployeeName, employeeID, employeeRole);
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }
}

