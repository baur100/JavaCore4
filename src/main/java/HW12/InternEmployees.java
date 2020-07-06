package HW12;

import javax.swing.plaf.DesktopPaneUI;

public class InternEmployees extends Employee {
    private String Department;

    public InternEmployees(String employeeName, int employeeID, String employeeRole, String Department) {
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
