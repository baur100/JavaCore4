package HW16_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Address WindermereFarmAddress = new Address("340 Wild rd", "Windermere", "FL", 32961);

        Agricultural wheat = new Agricultural("Wheat", 2);
        Agricultural soy = new Agricultural("Soy", 7);
        Agricultural watermelon = new Agricultural("Watermelon", 12);
        Agricultural rye = new Agricultural("Rye", 32);
        Agricultural barley = new Agricultural("Barley", 15);


        List<Agricultural> agricultural = new ArrayList<>();
        agricultural.add(wheat);
        agricultural.add(soy);
        agricultural.add(rye);
        agricultural.add(watermelon);
        agricultural.add(barley);

        HashMap<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 150);
        cattle.put(Cattle.COWS, 200);
        cattle.put(Cattle.GOATS, 30);
        cattle.put(Cattle.RABBITS, 250);
        cattle.put(Cattle.PIGS, 280);
        cattle.put(Cattle.SHEEPS, 120);


        Farm WindermereFarm = new Farm ("Windermere Farm", WindermereFarmAddress, cattle, agricultural);

        WindermereFarm.printFarmInfo();






    }
}
