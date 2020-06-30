package HW9Classes_mine;

public class BoardGame {
    public String gameName;
    public int numberOfPlayers;
    public String levelOfDiff;

    public void myFavGame (){
        System.out.println("I love playing " + gameName + ". It has " + levelOfDiff + " level of difficulty and allows to play " + numberOfPlayers + " players");
    }
}
