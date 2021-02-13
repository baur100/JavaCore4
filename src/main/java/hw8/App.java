package hw8;

public class App {
    public static void main(String[] args) {
        Ticket ticket1= new Ticket();
        ticket1.ticketnumber=8;
        ticket1.ticketname="Adja";
        ticket1.ticketdate="01/01/21";

        Ticket ticket2= new Ticket();
        ticket2.ticketnumber=9;
        ticket2.ticketname="Ibrahim";
        ticket2.ticketdate="09/09/11";

        ticket1.printticketnumber(ticket1.ticketnumber);
        ticket2.printticketname(ticket2.ticketname);


        System.out.println("\n");
        Plane planefast= new Plane();
        planefast.planenumber=13;
        planefast.airlines="Air France";
        planefast.active=true;
        planefast.isplaneavailable();

        Plane planeslow= new Plane();
        planeslow.planenumber=26;
        planeslow.airlines="Air Tahiti";
        planeslow.active=false;
        planeslow.printplaneairlines(planeslow.airlines);


        System.out.println("\n");

        Seat seatA= new Seat();
        seatA.seatnumber=1;
        seatA.seatclass="Business";
        seatA.seatfilled=true;
        seatA.printseatclass();


        Seat seatB= new Seat();
        seatB.seatnumber=1;
        seatB.seatclass="Business";
        seatB.seatfilled=false;
        seatB.printseatstatus();



        System.out.println("\n");

        Pilot pilot10 = new Pilot();
        pilot10.pilotid=10;
        pilot10.pilotlastname="Smith";
        pilot10.pilotready=false;

        pilot10.pilotcredentials();
        pilot10.ispilotready();


    }

    public static class Ticket{
        int ticketnumber;
        String ticketname;
        String ticketdate;


        public void printticketnumber(int ticketnumber){
            System.out.println("The ticket number is " + ticketnumber + ".");
        }

        public void printticketname(String ticketname){
            System.out.println("The name on the ticket is " + ticketname +".");
        }


    }

    public static class Seat{
        int seatnumber;
        String seatclass;
        boolean seatfilled;

        public void printseatclass(){
            System.out.println("This seat's class is " + seatclass + ".");
        }

        public void printseatstatus(){
            if (seatfilled==true){
                System.out.println("This seat is occupied.");
            }
            else{
                System.out.println("This plane is not occupied.");
            }
        }


    }

    public static class Plane{
        int planenumber;
        String airlines;
        boolean active;

        public void isplaneavailable(){
            if (active==true){
                System.out.println("This plane is ready to fly.");
            }
            else{
                System.out.println("This plane is not ready to fly.");
            }
        }

        public void printplaneairlines(String airlines){
            System.out.println("The plane's airline is " + airlines +".");
        }

    }

    public static class Pilot{
        int pilotid;
        String pilotlastname;
        boolean pilotready;

        public void pilotcredentials(){
            System.out.println("This pilot's ID is " + pilotid +".");
        }



        public void ispilotready(){
            if (pilotready=true){
                System.out.println("This pilot is available to fly.");
            }
            else{
                System.out.println("This pilot is unavailable to fly.");
            }
        }

    }
}
