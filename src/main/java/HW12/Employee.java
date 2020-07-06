package HW12;

public class Employee {
    protected String EmployeeName;
    protected int EmployeeID;
    protected String EmployeeRole;

    public Employee(String employeeName, int employeeID, String employeeRole) {
        this.EmployeeName = employeeName;
        this.EmployeeID = employeeID;
        this.EmployeeRole = employeeRole;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeRole() {
        return EmployeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        EmployeeRole = employeeRole;
    }



}
