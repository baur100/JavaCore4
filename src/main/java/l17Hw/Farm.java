package l17Hw;

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

    public Address getAddress() {
        return address;
    }

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public List<Agricultural> getAgricultural() {
        return agricultural;
    }

    public void printInfo(){
        System.out.println("Welcome to " + this.name + "!");
        System.out.println("In our farm we breed and grow " + cattle.size() + " types of cattle and " + agricultural.size() + " types of grains." );
        System.out.println("Cattle we breed are: ");
        for(Map.Entry<Cattle,Integer> type : cattle.entrySet()){
            System.out.println(type.getKey());
        }
        System.out.println("Agricultural we grow are:");
        agricultural.forEach(v -> System.out.println(v.getNameOfCulture()));
        System.out.println("Visit us on address:");
        this.address.getAddress();


    }
}
