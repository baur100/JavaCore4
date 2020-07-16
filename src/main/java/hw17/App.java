package hw17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {

    public static void main(String[] args) {


        HashMap<Cattle, Integer> cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.COWS, 3);
        cattle.put(Cattle.SHEEPS, 5);
        cattle.put(Cattle.PIGS, 9);
        cattle.put(Cattle.CHIKENS, 5);
        cattle.put(Cattle.TURKEYS, 6);

        System.out.println(cattle);

        Address boston = new Address("Cambridge St", "Boston", 34532);
        Address newyork = new Address ("Mahattan Ave", "NYC", 647382);



        System.out.print("First City is Boston, "); boston.printInfo();
        System.out.print("Second City is NYC, "); newyork.printInfo();




       AgreeCultural Wheet  = new AgreeCultural("Wheet", 3);
       AgreeCultural Soya  = new AgreeCultural("Soya", 31);
       AgreeCultural Pea  = new AgreeCultural("Pea", 333);



        List<AgreeCultural> agreeCultural = new ArrayList<AgreeCultural>();
        agreeCultural.add(Wheet);
        agreeCultural.add(Soya);
        agreeCultural.add(Pea);


//        for(int i =0; i<agreeCultural.size(); i++){
//            agreeCultural.get(i).printInfo();
//        }

        for (AgreeCultural v: agreeCultural){
            v.printInfo();
        }


        Farm farm1 = new Farm("Chicken", boston, cattle, agreeCultural);
        Farm farm2 = new Farm("Duck", newyork, cattle, agreeCultural);

       farm1.printInfo();
       farm2.printInfo();



    }




    }



