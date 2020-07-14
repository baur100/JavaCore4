package Homework19;

import Homework16.InsuranceCompanies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Address farmAddress = new Address("123 Farm St", "Farmtown","California",90051);

        HashMap<Cattle, Integer> cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.COWS, 20);
        cattle.put(Cattle.CHICKENS, 100);
        cattle.put(Cattle.PIGS, 51);
        cattle.put(Cattle.SHEEPS, 40);
        cattle.put(Cattle.TURKEYS, 25);

        List<Agriculture> agriculture = new ArrayList<Agriculture>();
        Agriculture wheat = new Agriculture("Wheat",50);
        Agriculture rice = new Agriculture("Rice", 100);
        Agriculture corn = new Agriculture("Corn", 150);
        agriculture.add(wheat);
        agriculture.add(rice);
        agriculture.add(corn);

        Farm patrickFarm = new Farm("Patrick's Farm", farmAddress, cattle, (ArrayList<Agriculture>) agriculture);
        patrickFarm.printInfo();

    }
}
