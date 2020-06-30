package hw8;

public class App1 {
    public static void main(String[] args) {
        // bike
        Bike suzuki = new Bike();

        suzuki.brand= "suzuki";
        suzuki.model= "gixxer sf";
        suzuki.color= "black";

        System.out.println(suzuki.brand);
        System.out.println(suzuki.model);
        System.out.println(suzuki.color);
        suzuki.printIt();
        suzuki.purchase();

        // Credit_Card
        Credit_Card Discover = new Credit_Card();
        Discover.total_credit= 15000;
        Discover.name_of_bank= "discover";
        Discover.region= "WA";
        Discover.printIt();
        Discover.shopping();

        // Laptop
        Laptop Mac = new Laptop();
        Mac.brand= "Macbook";
        Mac.model= "Pro";
        Mac.size= 13;
        Mac.printIt();
        Mac.specification();

        //Town
        Town bellevue = new Town();
        bellevue.name= "bellevue";
        bellevue.per_capita_area= 50;
        bellevue.printIt();
        bellevue.story();

    }
}
