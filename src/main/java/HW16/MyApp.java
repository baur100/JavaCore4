package HW16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {

        List<String> destination = new ArrayList<String>();
        destination.add("Paris");
        destination.add("Berlin");
        destination.add("Amsterdam");
        destination.add("New York");
        destination.add("London");

        for (String v:destination) {
            System.out.println(v);
        }
        System.out.println("---------------------------");

        destination.set(0, "Moscow");
        System.out.println(destination);
        System.out.println("---------------------------");

        List<Integer> fibonacci = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        System.out.println(fibonacci);
        System.out.println("---------------------------");

        int element = fibonacci.get(2);
        System.out.println("The element of index to is " + element);
        System.out.println("---------------------------");

        List<Employee> employee = new ArrayList<Employee>();
        Employee george = new Employee("George", "Washington", "Manager");
        Employee maria = new Employee("Maria", "Ivanova", "QA");
        Employee christine = new Employee("Christine", "Stuart", "Finance");
        Employee tom = new Employee("Tom", "Boyton", "CEO");
        Employee josh = new Employee("Josh", "Lee", "IT");

        employee.add(george);
        employee.add(maria);
        employee.add(christine);
        employee.add(tom);
        employee.add(josh);

        for (Employee v:employee) {
            System.out.println(v.getName());
        }
        System.out.println("---------------------------");

        employee.remove(christine);

        for (Employee v:employee) {
            System.out.println(v.getName());
        }
        System.out.println("---------------------------");

    }
}
