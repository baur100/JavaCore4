package HW17;

/*
* Create a class Farm
fields
private String name;
private Address address; ()
private HashMap<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS... Value    - Integer - number of animals of each kind)
private List<AgreeCultural> agreeCultural; (AgreeCultural - class
    private String nameOfCulture; Wheet, Soya, Pea
    private int fielsNumber;

method printInfo() - print out all info
Collapse
*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class HW17MainClass {
    public static void main(String[] args) {

        Address add1 = new Address("112 Hollow St","Milpitas","TN",98764,true);
        Address add2 = new Address("984 Sherin St","Square Town","AZ",98649,true);
        Address add3 = new Address("456 Able St","qwerty","TN",64453,true);
        Address add4 = new Address("302 Berryessa St","Fremont","CA",12435,true);
        Address add5 = new Address("643 Elan Village Ln","San Diego","OR",24553,true);
        List<Address> add = new ArrayList<Address>();
        add.add(add1);
        add.add(add2);
        add.add(add3);
        add.add(add4);
        add.add(add5);

        HashMap<Cattle,Integer> cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.CHICKENS,40);
        cattle.put(Cattle.COWS,20);
        cattle.put(Cattle.PIGS,30);
        cattle.put(Cattle.SHEEPS,50);
        cattle.put(Cattle.TURKEYS,30);

        AgriCultural a1 = new AgriCultural("Wheat");
        AgriCultural a2 = new AgriCultural("Soy");
        AgriCultural a3 = new AgriCultural("Peas");
        AgriCultural a4 = new AgriCultural("Rice");
        AgriCultural a5 = new AgriCultural("Quinoa");
        List<AgriCultural> agri = new ArrayList<AgriCultural>();
        agri.add(a1);
        agri.add(a2);
        agri.add(a3);
        agri.add(a4);
        agri.add(a5);

        Farm f = new Farm("Anna Peter",add,cattle, agri,"AgriCulture",20);
        f.printInfo();
    }
}
