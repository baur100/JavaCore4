package Example.Spare;


public class Seat{
    private int seatnumber;
    private String seatclass;
    private String aisle;

    public Seat(){}

    public void setSeatnumber(int Seatnumber){
        this.seatnumber=seatnumber;
    }

    public void setSeatclass(String seatclass){
        this.seatclass=seatclass;
    }

    public void setAisle(String aisle){
        this.aisle=aisle;
    }

    public int getSeatnumber(){
        return seatnumber;
    }

    public String getSeatclass(){
        return seatclass;
    }

    public String getSeatAisle(){
        return aisle;
    }

    public Seat(int seatnumber, String seatclass, String aisle){
        this.seatnumber=seatnumber;
        this.seatclass=seatclass;
        this.aisle=aisle;
    }

    public void printinfo(){
        System.out.println("This seat number is " + seatnumber +".");
        System.out.println("This seat's class is " + seatclass +".");
        System.out.println("This seat's aisle is " + aisle +".");
    }


}
