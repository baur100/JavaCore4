package HW19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        Address address1 = new Address("9714 Regent St", "Los Angeles", "CA ", 90034);

        Map<Cattle, Integer> cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.SHEEP, 77);
        cattle.put(Cattle.DUCKS, 66);
        cattle.put(Cattle.CHICKENS, 33);
        cattle.put(Cattle.PIGS, 101);
        cattle.put(Cattle.GOATS,45);

        List<Agricultural> agricultural=new ArrayList<Agricultural>();
        Agricultural agri1=new Agricultural("Wheat", 5);
        Agricultural agri2=new Agricultural("Soy", 7);
        Agricultural agri3=new Agricultural("Corn", 24);
        Agricultural agri4=new Agricultural("Rice", 30);
        agricultural.add(agri1);
        agricultural.add(agri2);
        agricultural.add(agri3);
        agricultural.add(agri4);

        Farm farmcolorado = new Farm("Colorado Farm", address1, cattle, agricultural);

        System.out.println(farmcolorado.printFarmInfo());
        for (int i = 0; i < agricultural.size(); i++) {
            System.out.println(agricultural.get(i).printAgriculturalInfo());
        }



    }



}
