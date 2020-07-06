package hw11;

import java.util.Arrays;

public class Price {

    private int priceWithDiscount;
    private int priceNoDiscount;
    private int [] priceRanges;
    private HardDrive capacity;

    public Price(int priceWithDiscount, int priceNoDiscount, int[] priceRanges, HardDrive capacity) {
        this.priceWithDiscount = priceWithDiscount;
        this.priceNoDiscount = priceNoDiscount;
        this.priceRanges = priceRanges;
        this.capacity = capacity;
    }

    public int getPriceWithDiscount() {
        return priceWithDiscount;
    }

    public void setPriceWithDiscount(int priceWithDiscount) {
        this.priceWithDiscount = priceWithDiscount;
    }

    public int getPriceNoDiscount() {
        return priceNoDiscount;
    }

    public void setPriceNoDiscount(int priceNoDiscount) {
        this.priceNoDiscount = priceNoDiscount;
    }

    public int[] getPriceRanges() {
        return priceRanges;
    }

    public void setPriceRanges(int[] priceRanges) {
        this.priceRanges = priceRanges;
    }

    public HardDrive getCapacity() {
        return capacity;
    }

    public void setCapacity(HardDrive capacity) {
        this.capacity = capacity;
    }


    public void printPrice() {
        System.out.println("Price{" +
                "priceWithDiscount=" + priceWithDiscount +
                ", priceNoDiscount=" + priceNoDiscount +
                ", priceRanges=" + Arrays.toString(priceRanges) +
               // ", capacity=" + capacity +
                '}');

        this.capacity.printHardDrive();
    }
}

