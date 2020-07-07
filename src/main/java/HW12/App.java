package HW12;

public class App {

//1. Create a super class and 3 child classes
//create 2 object of each class (including superclass - don't make it abstract)

    public static void main(String[] args) {

//1
        ManualQA tester = new ManualQA("Victoria", "Ret", "QA Engineer", 22);
        //String[] responsibilities = {"App testing", "Website testing", "SQL queries", "Test Cases"};
        tester.printInfo();

        ManualQA tester2 = new ManualQA();
        tester2.setName("John");
        tester2.setLastName("Mullen");
        tester2.setPosition("Qa Analyst");
        tester2.setAge(36);

//2
        Programmer dev = new Programmer("Alex", "Miller", "Programmer", 100000);
        tester.printInfo();

        Programmer dev2 = new Programmer();
        dev2.setName("Igor");
        dev2.setLastName("Ivanov");
        dev2.setPosition("Backend Developer");
        dev2.setSalary(120000);
        dev2.printInfo();

//3
        AutomationQA qa = new AutomationQA("Bill", "Black", "Automation QA", "New York");
        qa.printInfo();

        AutomationQA qa2 = new AutomationQA();
        qa2.setName("Alina");
        qa2.setLastName("Martin");
        qa2.setPosition("Automation QA");
        qa2.setCity("Miami");
        qa2.printInfo();

//4
        ItSpecialist businessAnalyst = new ItSpecialist("Chris", "Brown", "Business analyst");
        businessAnalyst.printInfo();

        ItSpecialist recruiter = new ItSpecialist();
        recruiter.setName("Anna");
        recruiter.setLastName("Gracheva");
        recruiter.setPosition("Manager");
        recruiter.printInfo();

    }
}
