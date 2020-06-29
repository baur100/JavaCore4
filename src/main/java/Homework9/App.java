package Homework9;

public class App {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        iPhone.brand = "Apple";
        iPhone.model = "XS Max";
        iPhone.version = "14";
        iPhone.color = "Black";

        iPhone.mobilePhone("iPhone");

        Phone android = new Phone();
        android.brand = "Samsung";
        android.model = "Galaxy";
        android.version = "10";
        android.color = "Blue";

        android.mobilePhone("Samsung Phone");
        System.out.println("***********************************");

        Snacks chips = new Snacks();
        chips.Doritos = "Doritos";
        chips.Cheetos = "Cheetos";
        chips.Lays = "Lays";
        chips.Ruffles = "Ruffles";

        chips.favoriteSnacks("Doritos");
        System.out.println("***********************************");

        BasketballTeam lakers = new BasketballTeam();
        lakers.Player = "LeBron James";
        lakers.Position = "Small Forward";
        lakers.Team = "Los Angeles Lakers";
        lakers.Age = "35";
        lakers.College = "None";

        lakers.basketball("");

        BasketballTeam warriors = new BasketballTeam();
        warriors.Player = "Stephen Curry";
        warriors.Position = "Point Guard";
        warriors.Team = "Golden State Warriors";
        warriors.Age = "32";
        warriors.College = "Davidson College";

        warriors.position("");
        System.out.println("***********************************");

        Travel Korea = new Travel();
        Korea.City = "Seoul";
        Korea.Population = "9,963,452";

        Korea.place("");

        Travel California = new Travel();
        California.City = "Los Angeles";
        California.Population = "12,447,000";

        California.place("");

    }
}
