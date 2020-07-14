package hw17hh;

import java.util.List;
import java.util.Map;

public class Farm {
    private String farmName;
    private Address address;
    private Map<Livestock, Integer> livestock;
    private List<Crops> cropsList;

    public Farm(String farmName, Address address, Map<Livestock, Integer> livestock, List<Crops> cropsList) {
        this.farmName = farmName;
        this.address = address;
        this.livestock = livestock;
        this.cropsList = cropsList;
    }

    @Override
    public String toString() {
        return "Farm: " + farmName +
                "\n" + address +
                "\n--------------------------------------------------" +
                "\nLivestock: " + livestock +
                "\n--------------------------------------------------" +
                "\nCrop List: " + cropsList;
    }

    public void printFarm() {
        System.out.println(toString());
    }
}
