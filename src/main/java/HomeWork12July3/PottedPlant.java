package HomeWork12July3;

public class PottedPlant extends Shop{

    protected String plantType;

    protected PottedPlant(String brandName, String prdSkuID, String botanicalName, double prdPrice, String prdName, String plantType) {
        super(brandName, prdSkuID, botanicalName, prdPrice, prdName);
        this.plantType = plantType;
    }

    protected void calPotPrice(double prdPrice, int countChosen){
        double chosenPrdPrice;
        chosenPrdPrice = prdPrice * countChosen;
        System.out.println("\tThe price of the " + prdName + " of quantity " + countChosen + " is worth $" + chosenPrdPrice);
    }


}
