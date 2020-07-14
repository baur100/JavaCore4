package hw17hh;

import l9.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apphw17hh {
    public static void main(String[] args) {

        try {

            Address upstateAddress = new Address("P.O. Box 376", "Red Hook", "NY", 12571);

            Map<Livestock, Integer> upstateLivestock = new HashMap<>();
            upstateLivestock.put(Livestock.COW, 50);
            upstateLivestock.put(Livestock.PIGS, 33);
            upstateLivestock.put(Livestock.SHEEP, 60);
            upstateLivestock.put(Livestock.GOATS, 5);
            upstateLivestock.put(Livestock.CHICKEN, 128);
            upstateLivestock.put(Livestock.DUCKS, 45);

            Crops Wheat = new Crops("Wheat", 10);
            Crops Rice = new Crops("Rice", 5);
            Crops Corn = new Crops("Corn", 20);
            Crops Potato = new Crops("Potato", 12);
            Crops Carrot = new Crops("Carrot", 8);
            Crops Cabbage = new Crops("Cabbage", 5);

            List<Crops> upstateCrops = new ArrayList<>();
            upstateCrops.add(Wheat);
            upstateCrops.add(Rice);
            upstateCrops.add(Corn);
            upstateCrops.add(Potato);
            upstateCrops.add(Carrot);
            upstateCrops.add(Cabbage);

            Farm upstateFarm = new Farm("Upstate Farm", upstateAddress, upstateLivestock, upstateCrops);

            System.out.println(upstateFarm.toString());

        } catch ( Exception error) {
            System.out.println(error.getMessage());
        } finally {
            System.out.println("--------------------------------------------------");
            System.out.println("My farm printed successfully))");
        }
    }
}
