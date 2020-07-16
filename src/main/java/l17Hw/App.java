package l17Hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Address adamsFarmAddress = new Address("735 Davoon Rd", "Campbell", "CA", 99999);

        HashMap<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS, 150);
        cattle.put(Cattle.PIGS, 100);
        cattle.put(Cattle.SHEEPS, 300);
        cattle.put(Cattle.CHICKENS, 500);
        cattle.put(Cattle.TURKEYS, 400);

        //System.out.println(cattle);

        Agricultural wheat = new Agricultural("wheat",10);
        Agricultural soya = new Agricultural("soya", 15);
        Agricultural pea = new Agricultural("pea", 5);

        List<Agricultural> agricultural= new ArrayList<>();
        agricultural.add(wheat);
        agricultural.add(soya);
        agricultural.add(pea);

        //agricultural.forEach(v -> System.out.println(v.getNameOfCulture() + " " + v.getFieldArea()));



        Farm adamsFarm = new Farm("Adam's farm", adamsFarmAddress,cattle,agricultural);
        adamsFarm.printInfo();


        }

}

