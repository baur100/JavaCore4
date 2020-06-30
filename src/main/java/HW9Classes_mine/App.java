package HW9Classes_mine;

public class App {
    public static void main(String[] args) {
        Cat breedless = new Cat();
        breedless.breed = "breedless";
        breedless.catName = "Brys atsyuda!";
        breedless.color = "red";

        Cat oriental = new Cat();
        oriental.breed = "oriental cat";
        oriental.catName = "Maurizio";
        oriental.color = "silver";

        System.out.println("This is a " + breedless.breed + " cat. His name is " + breedless.catName + ". And as you can see he has " + breedless.color + " fur.");
        System.out.println("**************");

        Employee ID123 = new Employee();
        ID123.name = "Artur";
        ID123.lastName = "Pirozhkov";
        ID123.rateDollars = 12;

        Employee ID562 = new Employee();
        ID562.name = "Vladimir";
        ID562.lastName = "Putin";
        ID562.rateDollars = 10000000;


        ID562.intro("Maurizio");
        ID123.intro("Brys atsyuda!");
        ID562.myWages();
        System.out.println("And what you have done in your life?");
        System.out.println("**************");

        BoardGame uno = new BoardGame();
        uno.gameName = "Uno";
        uno.levelOfDiff = "Medium";
        uno.numberOfPlayers = 6;

        BoardGame monopoly = new BoardGame();
        monopoly.gameName = "Monopoly";
        monopoly.levelOfDiff = "Hard";
        monopoly.numberOfPlayers = 5;

        uno.myFavGame();
        monopoly.myFavGame();
        System.out.println("**************");

        Course borsch = new Course();
        borsch.dishTitle = "borsch s salom";
        borsch.type = "main course";
        borsch.calories = 950;

        Course blins = new Course();
        blins.dishTitle = "blini s ikroi";
        blins.type = "appetizer";
        blins.calories = 700;

        borsch.myOrder("black tea");
        blins.myOrder("water");
        System.out.println("**************");
    }
}
