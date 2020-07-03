package Spare;

public class Ticket {
    private int ticketnumber;
    private String ticketname;
    private String ticketdate;

    public Ticket() {
    }

    public void setTicketnumber(int ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public int getTicketnumber() {
        return ticketnumber;
    }

    public String getTicketname() {
        return ticketname;
    }

    public String getTicketdate() {
        return ticketdate;
    }


    public void setTicketname(String ticketname) {
        this.ticketname = ticketname;
    }

    public void setTicketdate(String ticketdate) {
        this.ticketdate = ticketdate;
    }


    public Ticket(int ticketnumber, String ticketname, String ticketdate) {
        this.ticketnumber = ticketnumber;
        this.ticketname = ticketname;
        this.ticketdate = ticketdate;
    }


    public void printinfo() {
        System.out.println("This ticket number is " + ticketnumber + ".");
        System.out.println("The name on this ticket is " + ticketname + ".");
        System.out.println("This ticket's date is " + ticketdate + ".");
    }

}