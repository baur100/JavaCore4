package HW19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address farmAddress = new Address("123 Test st", "California", "CA", 850851);

        Map<Cattle,Integer> cattle = new HashMap<Cattle,Integer>();
        cattle.put(Cattle.COWS,12);
        cattle.put(Cattle.CHICKENS,30);
        cattle.put(Cattle.GOATS,5);
        cattle.put(Cattle.SHEEPS,10);
        cattle.put(Cattle.LLAMAS,25);
        cattle.put(Cattle.TURKEYS,15);

        List<Agricultural> agricultural = new ArrayList<Agricultural>();
        Agricultural corn = new Agricultural("Corn", 1);
        Agricultural oats = new Agricultural("Oat", 2);
        Agricultural wheat = new Agricultural("Wheat", 1);
        agricultural.add(corn);
        agricultural.add(oats);
        agricultural.add(wheat);

        Farm ecoFarm = new Farm("EcoFarm", farmAddress, cattle, agricultural);


        ecoFarm.printInfo();
        farmAddress.printAddress();
        for (Map.Entry<Cattle,Integer> x: cattle.entrySet()){
            Cattle c = x.getKey();
            int i = x.getValue();
            System.out.println(c + " - " + i);
        }
        for (Agricultural p: agricultural) {
            System.out.println(p.getNameOfCulture() + " = " +  p.getFieldsNumber());
        }
        




    }
}
