package Homework10;

public class Game {
    private String name;
    private String company;
    private String genre;

    public Game(String name, String company, String genre){
        this.name = name;
        this.company = company;
        this.genre = genre;
    }

    public void printGameInfo() {
        System.out.println("Name = " + name);
        System.out.println("Company = " + company);
        System.out.println("Genre = " + genre);
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setCompany(String newCompany){
        this.company = newCompany;
    }

    public String getCompany(){
        return this.company;
    }

    public void setGenre(String newGenre){
        this.genre = newGenre;
    }

    public String getGenre(){
        return this.genre;
    }
}
