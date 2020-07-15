package hw16_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {


    public static void main(String[] args) {

      List<String> agricultureList = new ArrayList<>();
      agricultureList.add("Soy");
      agricultureList.add("Wheat");
      agricultureList.add("Buckwheat");
      agricultureList.add("Wild Rice");

      Agriculture amyFarm = new Agriculture(agricultureList, 5);
      System.out.println("Amy's farm has a list of crops: " +agricultureList +
          "\nAnd she has "+amyFarm.getFieldsNumber() +" of fields per each per crop.");


      HashMap<Cattle,Integer> cattle = new HashMap<Cattle,Integer>();
      cattle.put(Cattle.CHICKENS,5);
      cattle.put(Cattle.COWS,10);
      cattle.put(Cattle.PIGS,7);
      cattle.put(Cattle.TURKEYS,2);
      cattle.put(Cattle.SHEEP,0);

      hw16_1.Address farmAddress = new Address("1943 Sepulveda street", "Rancho Santafe",
          "CA", 90004);
      Farm myFarm = new Farm("Amy's Ranch", farmAddress, cattle);
      System.out.print(myFarm.getName() + ": "); farmAddress.printAddress();
      System.out.println(cattle);

    }

    }


