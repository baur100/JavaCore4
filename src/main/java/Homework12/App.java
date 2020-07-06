package Homework12;

public class App {
    public static void main(String[] args) {
        Lakers lebron = new Lakers("Lebron", "James", "Los Angeles", "three", "Purple and Gold", "Small/Power Forward");
        lebron.printLakerInfo();

        Lakers ad = new Lakers("Anthony", "Davis", "Los Angeles", "zero", "Purple and Gold", "Power Forward/Center");
        ad.printLakerInfo();

        System.out.println("*************************************");

        Celtics tatum = new Celtics("Jayson", "Tatum", "Boston", "zero", 22, "St. Louis");
        tatum.printCelticInfo();

        Celtics kemba = new Celtics("Kemba", "Walker", "Boston", "zero", 30, "New York");
        kemba.printCelticInfo();

        System.out.println("*************************************");

        Warriors curry = new Warriors("Stephen", "Curry", "San Franciso", "three", "Akron, Ohio", "Davidson");
        curry.printWarriorInfo();

        Warriors klay = new Warriors("Klay", "Thompson", "San Francisco", "three", "Los Angeles", "Washington State");
        klay.printWarriorInfo();
    }
}
