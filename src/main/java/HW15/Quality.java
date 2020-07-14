package HW15;

import java.util.Arrays;

public class Quality {

    public Clothes[] compound;
    private int price;

    public Quality(int price, Clothes[] compound) {
        this.compound= compound;
        this.price = price;
    }


    public String toString() {
        return "Quality{" +
                "compound=" + Arrays.toString(compound) +
                ", price=" + price +
                '}';
    }
}
