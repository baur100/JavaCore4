package Example.Spare;

public class App {
    public static void main(String[] args) {

        Pilot arnold=new Pilot();
        arnold.setPilotid(21);
        arnold.setPilotairlines("Air Senegal");
        arnold.setPilotlastname("Schwarzenegger");
        System.out.println("\n");

        System.out.println("here is the info on the first pilot");

        System.out.println(arnold.getPilotid());
        System.out.println(arnold.getPilotlastname());
        System.out.println(arnold.getPilotairlines());

        System.out.println("\n");


        Pilot leonardo=new Pilot(5,"Dicaprio", "Air Italy");
        leonardo.printinfo();
        System.out.println("\n");

        Plane rocket=new Plane();
        rocket.setPlanenumber(13);
        rocket.setAirlines("Air Portugal");
        rocket.setMake("Boeing");

        System.out.println("here is the info on the first plane");

        System.out.println(rocket.getPlanenumber());
        System.out.println(rocket.getAirlines());
        System.out.println(rocket.getMake());
        System.out.println("\n");


        Plane helicopter=new Plane(8, "Air France", "Boeing");
        helicopter.printinfo();
        System.out.println("\n");


        Seat regularseat=new Seat();
        regularseat.setSeatnumber(13);
        regularseat.setAisle("Window");
        regularseat.setSeatclass("Economy");

        System.out.println("here is the info on the first seat");

        System.out.println(regularseat.getSeatnumber());
        System.out.println(regularseat.getSeatclass());
        System.out.println(regularseat.getSeatAisle());

        System.out.println("\n");


        Seat seatvip=new Seat(10, "Business", "Middle");
        seatvip.printinfo();
        System.out.println("\n");


        Ticket vipticket=new Ticket();
        vipticket.setTicketnumber(88);
        vipticket.setTicketdate("August 20");
        vipticket.setTicketname("Adja");

        System.out.println("here is the info on the first ticket");

        System.out.println(vipticket.getTicketnumber());
        System.out.println(vipticket.getTicketname());
        System.out.println(vipticket.getTicketdate());

        System.out.println("\n");


        Ticket regularticket=new Ticket(25, "Pompadour", "January 1");
        regularticket.printinfo();
        System.out.println("\n");


    }

}
