package HomeWork12July3;

public class Vegetable extends Shop{
    protected double vegWeight;
    protected String vegType;

    protected Vegetable(String brandName, String prdSkuID, String botanicalName, double prdPrice, String prdName, double vegWeight, String vegType) {
        super(brandName, prdSkuID, botanicalName, prdPrice, prdName);
        this.vegWeight = vegWeight;
        this.vegType = vegType;
    }

    protected void calVegPrice(double prdPrice, int countChosen, double vegWeight){
        double chosenPrdPrice;
        if(countChosen!=0) {
            chosenPrdPrice = prdPrice * countChosen;
            System.out.println("\tThe price of the " + prdName + " of quantity " + countChosen + " is worth $" + chosenPrdPrice);
        } else {
            chosenPrdPrice = prdPrice * vegWeight;
            System.out.println("\tThe price of the " + prdName + " of quantity " + vegWeight + " is worth $" + chosenPrdPrice);
        }
    }

    public double getVegWeight() { return vegWeight; }
    public void setVegWeight(double vegWeight) { this.vegWeight = vegWeight; }



}
