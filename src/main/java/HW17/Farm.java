package HW17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private List<Address> address;
    private HashMap<Cattle,Integer> cattle;
    private List<AgriCultural> agriCultural;
    private String nameOfCulture;
    private int fieldNumber;

    public Farm(String name, List<Address> address, HashMap<Cattle, Integer> cattle, List<AgriCultural> agriCultural, String nameOfCulture, int fieldNumber) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriCultural = agriCultural;
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public void printInfo(){
        System.out.println("\nFarm{" +
                "name='" + name + '\'' +
                ", nameOfCulture='" + nameOfCulture + '\'' +
                ", fieldNumber=" + fieldNumber +
                '}');

        System.out.println("\nAddresses:");
        for (Address a :address) {
            a.printAddressInfo();
        }
        System.out.println("\nCattle and its count List:");
        for(Map.Entry<Cattle,Integer> x : cattle.entrySet()){
            Cattle y = x.getKey();
            Integer z = x.getValue();
            System.out.println(y+" "+z);
        }
        System.out.println("\nAgriCulture:");
        for (AgriCultural a :agriCultural) {
            a.printAgriCulture();
        }

    }

}
