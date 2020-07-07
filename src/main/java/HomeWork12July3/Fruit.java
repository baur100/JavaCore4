package HomeWork12July3;

public abstract class Fruit extends Shop {
    protected double fruitWeight;
    protected int fruitCount;

    protected Fruit(){super();}
    protected Fruit(String brandName, String prdSkuID, String botanicalName, double prdPrice, String prdName, String color, double fruitWeight, int fruitCount) {
        super(brandName, prdSkuID, botanicalName, prdPrice, prdName,color);
        this.fruitWeight = fruitWeight;
        this.fruitCount = fruitCount;
    }

    protected void calFruitPrice(double prdPrice, int countChosen, double fruitWeight){
        double chosenPrdPrice;
        if(countChosen!=0) {
            chosenPrdPrice = prdPrice * countChosen;
            System.out.println("\tThe price of the " + prdName + " of quantity " + countChosen + " is worth $" + chosenPrdPrice);
        } else {
            chosenPrdPrice = prdPrice * fruitWeight;
            System.out.println("\tThe price of the " + prdName + " of quantity " + fruitWeight + " is worth $" + chosenPrdPrice);
        }
    }

    public double getFruitWeight() { return fruitWeight; }
    public void setFruitWeight(double fruitWeight) { this.fruitWeight = fruitWeight; }

    public int getFruitCount() { return fruitCount; }
    public void setFruitCount(int fruitCount) { this.fruitCount = fruitCount; }



}
