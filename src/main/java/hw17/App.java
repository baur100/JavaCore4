package hw17;
import java.util.*;

public class App {
    public static void main(String[] args) {
        HashMap<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.TURKEY,15);
        cattle.put(Cattle.CHIKENS, 32);
        cattle.put(Cattle.COWS,18);
        cattle.put(Cattle.PIGS, 12);
        cattle.put(Cattle.SHEEPS,8);


        Address adr1 = new Address("16254 St", "Bellevue", "WA", 98008);
        Address adr2 = new Address("14651 NE 1st st", "Boulder", "CO", 76045);
        Address adr3 = new Address("134 Denver Ave S", "Denver", "CO", 76940);
        Address adr4 = new Address("877 W hollywood ", "Long Beach", "CA", 92841);
        Address adr5 = new Address("23 Ave S", "Newhalem", "WA", 98138);
        Address adr6 = new Address("214 Rondel St", "Gretten", "WI", 75334);
        Address adr7 = new Address("12 Colby Ave", "Berrien Springs", "MI", 96234);



        Agricultural agr1 = new Agricultural("Wheat", 4);
        Agricultural agr2 = new Agricultural("Soya", 2);
        Agricultural agr3 = new Agricultural("Pea", 1);
        Agricultural agr4 = new Agricultural("Salads", 2);
        Agricultural agr5 = new Agricultural("Onions", 1);
        Agricultural agr6 = new Agricultural("Lentils", 2);
        Agricultural agr7 = new Agricultural("Potatoes",1);

        ArrayList<Agricultural> agriculturals = new ArrayList<>();
        agriculturals.add(agr1);
        agriculturals.add(agr2);
        agriculturals.add(agr3);
        agriculturals.add(agr4);
        agriculturals.add(agr5);
        agriculturals.add(agr6);
        agriculturals.add(agr7);


        String farmName = "CSU University Farm";
        Farm sf = new Farm(farmName,adr7,cattle,agriculturals);

        sf.printInfo();
        System.out.println("-------------------------------------");

        sf.printCattle();
        System.out.println("-------------------------------------");

        sf.printAgricultural();

    }
}