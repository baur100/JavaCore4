package HW10;

public class Pilot {
    private int pilotid;
    private String pilotlastname;
    private String pilotairlines;

    public Pilot() {
    }


    public Pilot(int pilotid, String pilotlastname, String pilotairlines) {
        this.pilotid = pilotid;
        this.pilotlastname = pilotlastname;
        this.pilotairlines = pilotairlines;
    }

    public void setPilotid(int pilotid) {
        this.pilotid = pilotid;
    }

    public void setPilotlastname(String pilotlastname) {
        this.pilotlastname = pilotlastname;
    }

    public void setPilotairlines(String pilotairlines) {
        this.pilotairlines = pilotairlines;
    }

    public int getPilotid() {
        return pilotid;
    }

    public String getPilotlastname() {
        return pilotlastname;
    }

    public String getPilotairlines() {
        return pilotairlines;
    }


    public void printinfo() {
        System.out.println("This pilot's ID is " + pilotid + ".");
        System.out.println("This pilot's last name is " + pilotlastname + ".");
        System.out.println("This pilot's airlines is " + pilotairlines + ".");
    }
}





