package Homework12;

public class Lakers extends Basketball{
    private String teamColor;
    private String position;

    public Lakers(String name, String lastName, String city, String championships, String teamColor, String position) {
        super(name, lastName, city, championships);
        this.teamColor = teamColor;
        this.position = position;
    }

    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printLakerInfo(){
        System.out.println("First Name = "+name+" Last Name = "+lastName+" Team City = "+city+" Number of rings = "+championships+" Color = "+teamColor+" Position = "+position);
    }
}
