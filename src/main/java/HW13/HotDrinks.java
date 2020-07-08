package HW13;

public class HotDrinks implements Drinks {

    public String tea;
    public String coffee;
    public String cocoa;

    public HotDrinks(String tea, String coffee, String cocoa) {
        this.tea = tea;
        this.coffee = coffee;
        this.cocoa = cocoa;
    }

    public String getTea() {
        return tea;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getCocoa() {
        return cocoa;
    }

    public void setCocoa(String cocoa) {
        this.cocoa = cocoa;
    }

    @Override
    public void drink() {

        System.out.println("I don't drink a lot of coffee");
    }
    @Override
    public void spill() {

        System.out.println("I spilled coffee");

    }
    @Override
    public void sip(){

        System.out.println("I like to sip tea" );
    }
}
