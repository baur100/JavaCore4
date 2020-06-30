package hw8;

public class Credit_Card {
    public int total_credit;
    public String name_of_bank;
    public String region;

    public void printIt(){
        System.out.println("total_credit = + " +total_credit);
        System.out.println("name_of_bank : " +name_of_bank);
        System.out.println("region : " +region);
    }

    public void shopping(){
        System.out.println("I used half of my amount $" +total_credit + " given by " +name_of_bank + " from this region " +region);
    }
}
