package HW12;

public class App {
    public static void main(String[] args) {
        Employee kate = new Employee("Kate", "Lesley", "CEO");
        Employee steve = new Employee("Steve", "Jobs", "owner");

        Accountant john = new Accountant("John", "Stevens", "Accountant", 100000);
        john.getAccInfo();
        System.out.println("--------------------------------");
        Accountant cameron = new Accountant("Cameron", "Diaz", "Accountant", 150000);
        cameron.getAccInfo();
        System.out.println("--------------------------------");

        Manager troy = new Manager("Troy", "Gritz", "Manager", "Monday through Friday");
        troy.getManagerInfo();
        System.out.println("---------------------------------");
        Manager mike = new Manager("Mike", "Oliver", "Manager", "Tuesday through Saturday");
        mike.getManagerInfo();
        System.out.println("---------------------------------");

        QA ana = new QA("Ana", "Bakhareva", "QA", "FrontEnd");
        ana.getQaInfo();
        QA nadya = new QA("Nadya", "Ivanova", "QA", "BackEnd");
        nadya.getQaInfo();

    }

}
