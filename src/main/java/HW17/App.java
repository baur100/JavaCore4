package HW17;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

        public static void main(String[] args) {

           String name = "My New Farm";

            Address address1 = new Address("1829 S Henrick st", "Louisville", "MA", 11929);


            ArrayList<AgreeCultural> agreeCultural = new ArrayList<>();

            AgreeCultural agr = new AgreeCultural("AgriCulture", 25);


            agreeCultural.add(2, new AgreeCultural("soya", 5) );
            agreeCultural.add(0, agr);

            HashMap<Cattle, Integer> cattle = new HashMap<>();
            cattle.put(Cattle.CHICKENS, 1);
            cattle.put(Cattle.COWS, 2);
            cattle.put(Cattle.TURCKEYS, 2);
            cattle.put(Cattle.PIGS, 1);
            cattle.put(Cattle.SHEEPS,16);
            System.out.println(cattle);

          Farm farm = new Farm("My New Farm", new Address("1829 S Henrick st", "Lousiville", "MA", 11274),
                                new Cattle [] {Cattle.CHICKENS, Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.COWS}, new AgreeCultural("soya", 25));
         farm.printThis();
         System.out.println(farm);

        }

    }


