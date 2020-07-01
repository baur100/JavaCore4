package HM10;

public class Soccer_Team {
    private String name;
    private String country;
    private int avrAgePlayers;

    public Soccer_Team(String name, String country, int avrAgePlayers){
    this.name=name;
    this.country=country;
    this.avrAgePlayers=avrAgePlayers;
    }
    public void printInfo(){
        System.out.println("My favorite team: " + "\n" + name+"\n"+country+"\n"+avrAgePlayers );
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {

        return country;
    }

    public void setAvrAgePlayers(int avrAgePlayers) {
        this.avrAgePlayers = avrAgePlayers;
    }

    public int getAvrAgePlayers() {
        return avrAgePlayers;
    }
}
