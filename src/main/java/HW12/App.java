package HW12;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String args[]) {
        EntryLevelEmployees Jane = new EntryLevelEmployees("Jane", 123456, "Clerk", "Mail");
        EntryLevelEmployees Josh = new EntryLevelEmployees("Jpsh", 123213, "Receptionist", "Concierge");
        System.out.println( Jane.getEmployeeName() + " EEID: "+Jane.getEmployeeID() +" Current Role: " + Jane.getEmployeeRole() + " at " + Jane.getDepartment() + " Department" );
        System.out.println( Josh.getEmployeeName() + " EEID: "+Josh.getEmployeeID() +" Current Role: " + Josh.getEmployeeRole() + " at " + Josh.getDepartment() + " Department" );
        System.out.println("********************************");

        ExecutiveEmployees Barry = new ExecutiveEmployees("Barry", 423454, "VP Marketing", "Marketing");
        ExecutiveEmployees Greg = new ExecutiveEmployees("Greg", 123435, "Director of HR", "HR");
        System.out.println( Barry.getEmployeeName() + " EEID: "+Barry.getEmployeeID() +" Current Role: " + Barry.getEmployeeRole() + " at " + Barry.getDepartment() + " Department" );
        System.out.println( Greg.getEmployeeName() + " EEID: "+Greg.getEmployeeID() +" Current Role: " + Greg.getEmployeeRole() + " at " + Greg.getDepartment() + " Department" );
        System.out.println("********************************");

        InternEmployees David = new InternEmployees("David", 264356, "Finance intern", "Accounting");
        InternEmployees Gina = new InternEmployees("Gina", 142453, "QA Intern", "IT");
        System.out.println( David.getEmployeeName() + " EEID: "+David.getEmployeeID() +" Current Role: " + David.getEmployeeRole() + " at " + David.getDepartment() + " Department" );
        System.out.println( Josh.getEmployeeName() + " EEID: "+Gina.getEmployeeID() +" Current Role: " + Gina.getEmployeeRole() + " at " + Gina.getDepartment() + " Department" );





    }
}
