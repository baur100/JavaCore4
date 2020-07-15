package hw19;

import hw18.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppHW19 {

    public static void main(String[] args) {
        Address farmAdd = new Address("100 Palms Blvd",
                "Los Angeles", "CA", 90043);
        farmAdd.printAddress();

        List <AgreeCultural> agree = new ArrayList<AgreeCultural>();
        AgreeCultural riceFarm = new AgreeCultural(
                "Rice ", 101);
        agree.add(riceFarm);
        riceFarm.printAgreeInfo();

        AgreeCultural tomatoFarm = new AgreeCultural(
                "Tomato ", 102);
        agree.add(tomatoFarm);
        tomatoFarm.printAgreeInfo();

        AgreeCultural wheatFarm = new AgreeCultural(
                "Wheat ", 103);
        agree.add(wheatFarm);
        wheatFarm.printAgreeInfo();

        AgreeCultural soyFarm = new AgreeCultural(
                "Soy ", 104);
        agree.add(soyFarm);
        soyFarm.printAgreeInfo();

        AgreeCultural potatoFarm = new AgreeCultural(
                "Potato " , 105);
        agree.add(potatoFarm);
        potatoFarm.printAgreeInfo();
        System.out.println("**************");

        HashMap<Cattle, Integer> numberOfCattle = new HashMap<Cattle, Integer>();
        numberOfCattle.put (Cattle.COWS, 100);
        numberOfCattle.put(Cattle.SHEEPS, 110);
        numberOfCattle.put(Cattle.CHICKENS, 1000);
        numberOfCattle.put(Cattle.DUCKS, 1010);
        numberOfCattle.put(Cattle.RABITS, 105);

        for (Map.Entry<Cattle, Integer> pair : numberOfCattle.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }


    }


}
