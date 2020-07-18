package tickets;

public class TicketPrice {
    private double fare;

    public TicketPrice(int fare) {
        this.fare = fare;
    }

    public double getPrice(int age) {
        if(age<=2)
            return 0;
        if(age<=12)
            return fare*0.5;
        if(age>65)
            return fare*0.8;
        return fare;
    }

}
