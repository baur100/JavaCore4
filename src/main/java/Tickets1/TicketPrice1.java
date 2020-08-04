package Tickets1;

public class TicketPrice1 {
    private double fare;

    public TicketPrice1(double fare) {
        this.fare = fare;
    }
    public double getPrice(int age){
        if(age<=2){
            return 0;
        }
        if(age<=12){
            return fare*0.5;
        }
        if(age>65){
            return fare*0.8;
        }
        return this.fare;
    }
}
