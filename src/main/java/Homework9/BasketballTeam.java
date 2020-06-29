package Homework9;

public class BasketballTeam {
    public String Player;
    public String Position;
    public String Team;
    public String Age;
    public String College;

    public void basketball(String player){
        System.out.println("My favorite basketball player is "+Player + " from the "+Team);
        System.out.println("He is "+Age+ " years old"+" and plays "+Position);
    }

    public void position(String position){
        System.out.println("My favorite point guard in the NBA is "+Player);
    }
}
