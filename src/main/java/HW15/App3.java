package HW15;

import HW15.Address;
import HW15.Employee;

import java.util.HashMap;
import java.util.Map;

public class App3 {
    public static void main(String[] args) {
        Map<Employee, Address> info = new HashMap<>();

        Employee valera = new Employee("Valera", "Smith");
        Address valeraAddress = new Address("125 Glenshire Way", "Orlando", "FL", 32815);

        info.put(valera, valeraAddress);

        Employee fedor = new Employee("Fedya", "Medvedev");
        Address addressFedora = new Address("1001 Lincoln St", "Washington", "DC", 10517);

        info.put(fedor, addressFedora);

        Employee putin = new Employee("Vladimir", "Putin");
        Address kremlin = new Address("Kremlin", "Moscow", "Russia", 100000);

        info.put(putin, kremlin);

        info.put(new Employee(), new Address());

        System.out.println(info.size());

        System.out.println("**********");

        info.remove(putin);

        System.out.println(info.size());

        System.out.println("**********");

        info.replace(valera, new Address("460 Read circle", "New York", "NY", 25894));

        System.out.println(info.size());

        // Unfortunately I couldn't find a way to iterate though this kind of HashMaps or to get info from it
    }
}
