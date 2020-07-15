package HW16_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<Cattle ,Integer> cattle = new HashMap<Cattle,Integer>();



        cattle.put(Cattle.CHICKEN,20);
        cattle.put(Cattle.PIGS,10);
        cattle.put(Cattle.SHEEPS,15);
        cattle.put(Cattle.COW,20);
        cattle.put(Cattle.TURKEYS,23);




        List<Agricultural> agricultural = new ArrayList<Agricultural>();
        Agricultural Wheat = new Agricultural("wheat",1);
        Agricultural Soy = new Agricultural("Soy",2);
        Agricultural pea = new Agricultural("pea",3);
        agricultural.add(Wheat);
        agricultural.add(Soy);
        agricultural.add(pea);
        Address a1 = new Address("1234 Farm Street","Oak","CA",90283);
        Farm CattleFarm = new Farm("CattleFarm",a1,cattle,agricultural);

        CattleFarm.printinfo();



    }
}
