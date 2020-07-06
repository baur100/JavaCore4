package HomeWork12July3;

public class Shop {

    protected  String brandName;
    protected String prdSkuID;
    protected String botanicalName;
    protected double prdPrice;
    protected String prdName;
    protected String color;

    protected Shop(String brandName, String prdSkuID, String botanicalName, double prdPrice, String prdName, String color) {
        this.brandName = brandName;
        this.prdSkuID = prdSkuID;
        this.botanicalName = botanicalName;
        this.prdPrice = prdPrice;
        this.prdName = prdName;
        this.color = color;
    }

    protected Shop(String brandName, String prdSkuID, String botanicalName, double prdPrice, String prdName) {
        this.brandName = brandName;
        this.prdSkuID = prdSkuID;
        this.botanicalName = botanicalName;
        this.prdPrice = prdPrice;
        this.prdName = prdName;
    }

    protected void printPrdDetails(){
        System.out.println("\n brandName='" + brandName +
                    "\n prdSkuID='" + prdSkuID + '\'' +
                    "\n botanicalName='" + botanicalName + '\'' +
                    "\n prdPrice=" + prdPrice +
                    "\n prdName='" + prdName);
    }

/*
    protected String getColor() { return color; }
    protected void setColor(String color) { this.color = color; }
 */

    public double getPrdPrice() { return prdPrice; }
    public void setPrdPrice(double prdPrice) { this.prdPrice = prdPrice; }

}
