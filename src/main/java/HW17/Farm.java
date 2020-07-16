package HW17;


import java.util.ArrayList;
import java.util.HashMap;

public class Farm {

    public static void main(String[] args) {

         String name = "My New Farm";


        Address address1 = new Address("1829 S Henrick st", "Louisville", "MA", 11929);
        address1.printInfo();


        HashMap <Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICHENS, 12);
        cattle.put(Cattle.COWS, 25);
        cattle.put(Cattle.TURCKEYS, 26);
        cattle.put(Cattle.PIGS, 10);
        cattle.put(Cattle.SHEEPS,19);
        System.out.println(cattle);

        AgreeCultural agr = new AgreeCultural("AgriCulture", 25);
        agr.printThis();

        ArrayList <AgreeCultural> agreeCultural = new ArrayList<>();
        //agreeCultural.add(2, );

    }
}
