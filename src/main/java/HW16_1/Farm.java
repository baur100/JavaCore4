package HW16_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private List<Agricultural> agricultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, List<Agricultural> agricultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agricultural = agricultural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(HashMap<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<Agricultural> getAgricultural() {
        return agricultural;
    }

    public void setAgricultural(List<Agricultural> agricultural) {
        this.agricultural = agricultural;
    }

    public void printFarmInfo (){
        System.out.println(name +
                "\n");
        address.printAddress();
        System.out.println("" +
                "\nCattles:");
        for (Map.Entry <Cattle, Integer> pair: cattle.entrySet()) {
            System.out.println(pair.getKey() + " , Amount: " + pair.getValue());
        }
        System.out.println("" +
                "\nCultures:");
        agricultural.forEach(v-> System.out.println(v.printCultureInfo()));

    }


}
