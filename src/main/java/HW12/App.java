package HW12;

public class App {
    public static void main(String[] args) {
        Bestbydate date1 = new Bestbydate("October", 25, 2021);
        Produce pastaHealthy = new Produce("Healthy rye", date1);
        pastaHealthy.printProduceInfo();

        System.out.println("************");

        Bestbydate date2 = new Bestbydate("September", 01, 2022);
        Produce tomatoDicedTom = new Produce("Uncly Tom's Diced Tomatoes", date2);
        tomatoDicedTom.printProduceInfo();

        System.out.println("************");

        Bestbydate date3 = new Bestbydate("August", 20, 2020);
        Yogurt dannon3 = new Yogurt("Dannon", date3, 3.25, "Whole milk");
        dannon3.printYogurt();

        System.out.println("************");

        Bestbydate date4 = new Bestbydate("July", 15, 2020);
        Yogurt coco = new Yogurt("Coco joy", date4, 2.0, "Coconut milk");
        coco.printYogurt();

        System.out.println("************");

        Bestbydate date5 = new Bestbydate("July", 05, 2020);
        Bread frenchbaguette = new Bread("French Baguette", date5, "Bleached wheat", false);
        frenchbaguette.printBread();

        System.out.println("************");

        Bestbydate date6 = new Bestbydate("July", 8, 2020);
        Bread riceBread = new Bread("Rice bread", date6, "Rice", true);
        riceBread.printBread();

        System.out.println("************");
        Bestbydate date7 = new Bestbydate ("August", 31, 2020);
        Eggs freeRangeCutieHen = new Eggs ("Cutie Hen", date7, 1);
        freeRangeCutieHen.printEggs();

        System.out.println("************");
        Bestbydate date8 = new Bestbydate("August", 14, 2020);
        Eggs cheapFarmer = new Eggs("Farmer's Eggs", date8, 3);
        cheapFarmer.printEggs();
    }
}
