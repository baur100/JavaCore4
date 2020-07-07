package HW9;

public class MyApp1 {
    public static void main(String[] args) {
        Company apple = new Company("Apple", 1995, "Software");
        apple.printCompanyInfo();
        Company google = new Company();
        google.setType("Computers");


        Book cinderella = new Book("Cinderella", "Charles Perrault", 1000);
        cinderella.printBookInfo();
        Book shrek = new Book();
        shrek.setNameOfBook("Shrek");

        Planet mars = new Planet("Mars", 100000, "red");
        mars.printPlanetInfo();
        Planet saturn = new Planet();
        saturn.setName("Saturn");

        Game soccer = new Game("soccer", 11, "Sport");
        soccer.getGameInfo();
        Game basketball = new Game();
        basketball.setNameOfGame("Basketball");
    }
}
