package HW12;

public class Yogurt extends Produce {
    protected double fatContentPercent;
    protected String milkType;

    public Yogurt (String name, Bestbydate bestbydate, double fatContentPercent, String milkType){
        super(name, bestbydate);
        this.fatContentPercent = fatContentPercent;
        this.milkType = milkType;
    }

    public double getFatContentPercent() {
        return fatContentPercent;
    }

    public void setFatContentPercent(double fatContentPercent) {
        this.fatContentPercent = fatContentPercent;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public void printYogurt (){
        printProduceInfo();
        System.out.println(milkType +"\n" + fatContentPercent+"% of fat");
    }
}
