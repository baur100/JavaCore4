package HW9;

public class Game {
    private String nameOfGame;
    private int numberOfPlayers;
    private String type;

    public Game(String nameOfGame, int numberOfPlayers, String type) {
        this.nameOfGame = nameOfGame;
        this.numberOfPlayers = numberOfPlayers;
        this.type = type;
    }

    public Game() {
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }
    public void setNumberOfPlayers(int numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
    }
    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public void getGameInfo(){
        System.out.println("Name Of Game = " + nameOfGame + "\nNumber Of Players = " + numberOfPlayers + "\nType = " + type);
    }


}
