package HomeWork12July3;

public class HW12MainConsumers {
    public static void main(String[] args) {

        System.out.println("\n\t\t\tFRUITS");
        Apple apple1 = new Apple("Fuji","FruitApp01","abcd",3.43,"Fuji Apple","Red",2.00,0);
        apple1.printPrdDetails();
        apple1.calFruitPrice(apple1.getPrdPrice(),apple1.getFruitCount(),apple1.getFruitWeight());
        System.out.println("\n");

        Mango mango1 = new Mango("Alphonse","FruitMang01","xyz",1.49,"Alphonse Mango","Yellow",0.00,3);
        mango1.printPrdDetails();
        mango1.calFruitPrice(mango1.getPrdPrice(),mango1.getFruitCount(),mango1.getFruitWeight());
        System.out.println("\n");

        Banana banana1 = new Banana("Yellow","FruitBan01","uvw",2.49,"Yellow Banana","Yellow",0.00,3);
        banana1.printPrdDetails();
        banana1.calFruitPrice(banana1.getPrdPrice(),banana1.getFruitCount(),banana1.getFruitWeight());
        System.out.println("\n");

        System.out.println("\n\t\t\tPOTTED PLANTS");
        BasilPlant bp1 = new BasilPlant("Tulsi","PotPlntBP01","Basil Plant",4.55,"RamaTulsi","Medicinal Plant");
        bp1.printPrdDetails();
        bp1.calPotPrice(bp1.getPrdPrice(),2);
        System.out.println("\n");

        RosePlant rp1 = new RosePlant("Rose","PotPlntR01","Rose Plant",5.55,"BangaloreRose","Decorative Plant");
        rp1.printPrdDetails();
        rp1.calPotPrice(rp1.getPrdPrice(),5);
        System.out.println("\n");

        Orchids o1 = new Orchids("Orchid","PotPlntO01","Orchid Plant",2.55,"Orchid Plant","Indoor Plant");
        o1.printPrdDetails();
        o1.calPotPrice(o1.getPrdPrice(),6);
        System.out.println("\n");

        System.out.println("\n\t\t\tVEGETABLES");
        Onion on1 = new Onion("White Onions","ONION","White Onion",0.97,"Onion",5.00,"White");
        on1.printPrdDetails();
        on1.calVegPrice(on1.getPrdPrice(),0,on1.getVegWeight());
        System.out.println("\n");

        Tomato to1 = new Tomato("Roma Onions","Tomato","qwerty",0.30,"Tomatoes",0.00,"Red");
        to1.printPrdDetails();
        to1.calVegPrice(on1.getPrdPrice(),6,on1.getVegWeight());
        System.out.println("\n");

    }
}
