package hw8;

public class AppHW8 {
    public static void main(String[] args) {
        TravelInfo tripPlan = new TravelInfo();
        tripPlan.from = "From: LAX";
        tripPlan.to = "To : Lisbon";
        tripPlan.departingDate = "Leaving on June 18th";
        tripPlan.returnDate = "Coming back on June 28th!!";

        tripPlan.nextAmenity();
        System.out.println("************************");

        FlightAmenity nextInfo = new FlightAmenity();
        nextInfo.nonStop = "American Airline nonstop Flight!";
        nextInfo.businessClass = "One BusinessClass seat available!!";
        nextInfo.nextPersonalData();
        System.out.println("************************");

        PersonalData passengerInfo = new PersonalData();
        passengerInfo.firstName = "First Name: Big";
        passengerInfo.lastName = "Last Name: Smile";
        passengerInfo.dateOfBirth = "Date of Birth: 6-16-1990";
        passengerInfo.nextPayment();
        System.out.println("************************");

        Payment paymentInfo = new Payment();
        paymentInfo.paymentMethod = "PaymentMethod: Credit Card.";
        paymentInfo.cardType = "Card Type: Visa ";
        paymentInfo.cardNumber = 1234569089;
        paymentInfo.travelConfirmation();
        System.out.println("************************");
        System.out.println("Enjoy your trip!!");







    }


}
