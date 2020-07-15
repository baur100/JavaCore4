package hw19;

import hw18.Address;

import java.util.HashMap;
import java.util.List;

public class Farm {
    private String farmName;
    private Address address;
    private HashMap <Cattle, Integer> cattle;
    private List <AgreeCultural> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle,
            Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.farmName = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public String getName() {
        return farmName;
    }

    public void setName(String name) {
        this.farmName = name;
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

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    public void printFarmInfo(){
        System.out.println(this.farmName);
        address.printAddress();

        for (AgreeCultural agree: agreeCultural) {
            System.out.println(agree.getNameOfCulture() + " "
                    + agree.getNameOfCulture());
            System.out.println(this.cattle);

        }
    }
}
