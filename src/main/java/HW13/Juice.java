package HW13;

public class Juice implements Drinks {

    private String orangeJuice;
    private String appleJuice;
    private String tomatoJuice;

    public Juice(String orangeJuice, String appleJuice, String tomatoJuice) {
        this.orangeJuice = orangeJuice;
        this.appleJuice = appleJuice;
        this.tomatoJuice = tomatoJuice;

    }

    public String getOrangeJuice() {
        return orangeJuice;
    }

    public void setOrangeJuice(String orangeJuice) {
        this.orangeJuice = orangeJuice;
    }

    public String getAppleJuice() {
        return appleJuice;
    }

    public void setAppleJuice(String appleJuice) {
        this.appleJuice = appleJuice;
    }

    public String getTomatoJuice() {
        return tomatoJuice;
    }

    public void setTomatoJuice(String tomatoJuice) {
        this.tomatoJuice = tomatoJuice;
    }
    @Override
    public void drink() {

        System.out.println("I usually drink " + orangeJuice);
    }
    @Override
    public void spill() {

        System.out.println("I spilled an " + appleJuice);
    }
    @Override
    public void sip() {

        System.out.println("I sipped " + tomatoJuice);
    }
}
