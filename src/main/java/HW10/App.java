package HW10;

import java.nio.charset.CoderResult;

public class App {
    public static void main(String[] args) {
        Course seledkaPodShuboi = new Course();
        seledkaPodShuboi.setDishTitle("Seledka in furs");
        seledkaPodShuboi.setType("Appetizer");
        seledkaPodShuboi.setCalories(590);

        Course borsch = new Course("Borsch", "main course", 800);

        borsch.printInfo();

        seledkaPodShuboi.printInfo();

        System.out.println("*******************");

        Cat innokentiy = new Cat();
        innokentiy.setAge(12);
        innokentiy.setCatName("Kesha");
        innokentiy.setBreed("breedless");

        Cat molly = new Cat ("Scottish fold", "Molly", 7);

        molly.printInfo();

        innokentiy.printInfo();

        System.out.println("*******************");

        Employee alejandro = new Employee();
        alejandro.setName("Alejandro");
        alejandro.setLastName("Iglesias");
        alejandro.setRateDollars(55);

        Employee valera = new Employee("Valera", "Bond", 8);

        valera.printInfo();

        alejandro.printInfo();

        System.out.println("*******************");

        BoardGame fiveSec = new BoardGame();
        fiveSec.setGameName("5 second");
        fiveSec.setLevelOfDiff("medium");
        fiveSec.setNumberOfPlayers(4);

        BoardGame monopoly = new BoardGame("Monopoly", "Easy", 6);

        monopoly.printInfo();

        fiveSec.printInfo();

    }
}
