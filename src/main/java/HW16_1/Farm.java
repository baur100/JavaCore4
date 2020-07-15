package HW16_1;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<Agricultural> agricultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<Agricultural> agricultural) {
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

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<Agricultural> getAgricultural() {
        return agricultural;
    }

    public void setAgricultural(List<Agricultural> agricultural) {
        this.agricultural = agricultural;
    }

    public void printinfo() {
        System.out.println("Farm " + this.name + "Located at " + address.getStreetAddress() + " " + address.getTown() + " " + address.getState());

        System.out.println("there are currently " + cattle.get(Cattle.COW) + " cows, " + cattle.get(Cattle.TURKEYS) + " turkeys, " + cattle.get(Cattle.SHEEPS) + " sheeps.");
        for (Agricultural v : agricultural) {
            System.out.println("there is crop " + v.getNameOfCulture() + " which is field number" + v.getFieldNumber());


        }
    }
}