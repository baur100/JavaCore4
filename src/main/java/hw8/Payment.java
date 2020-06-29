package hw8;

public class Payment {
    public String paymentMethod;
    public String cardType;
    public int cardNumber;


    public void travelConfirmation (){
        System.out.println((paymentMethod +" " + cardType + cardNumber + "!! Payment successful"));
    }


}
