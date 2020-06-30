package HW10;

public class BoardGame {
    private String gameName;
    private int numberOfPlayers;
    private String levelOfDiff;

    public BoardGame (){}

    public BoardGame (String gameName, String levelOfDiff, int numberOfPlayers){
        this.gameName = gameName;
        this.levelOfDiff = levelOfDiff;
        this.numberOfPlayers = numberOfPlayers;
    }

    public void myFavGame (){
        System.out.println("I love playing " + gameName + ". " +
                "\nIt has " + levelOfDiff + " level of difficulty " +
                "\nand allows to play " + numberOfPlayers + " players");
    }

    public void printInfo () {
        System.out.println("Name of a game = " + gameName +
                "\nLevel of Difficulty = " + levelOfDiff +
                "\nMax number of players = " + numberOfPlayers);
    }

    public void setGameName (String gameName){
        this.gameName = gameName;
    }

    public String getGameName (){
        return gameName;
    }

    public void setLevelOfDiff (String levelOfDiff){
        this.levelOfDiff = levelOfDiff;
    }

    public String getLevelOfDiff (){
        return levelOfDiff;
    }

    public void setNumberOfPlayers (int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers (){
        return numberOfPlayers;
    }
}
