package hw10;

public class WashingMachine {
    private int capacity;
    private String programs;
    private int price;

    public WashingMachine() {}


    public WashingMachine (int capacity, String programs, int price) {

        this.capacity = capacity;
        this.programs = programs;
        this.price = price;

    }

    public void printData() {
        System.out.println("The capacity is " + capacity +"\n"
                + "it works on " + programs+ " and it's price is " + price);

    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 20) {
            System.out.println(capacity);
        } else {
            System.out.println("need to be more than 20");
        }
    }


    public String getPrograms() {
        return programs;
    }

    public void setPrograms(String programs){
        if (programs == "Automatic") {
            System.out.println(programs);
        } else {
            System.out.println("outdated, too old to operate");
        }

    }


    public int getPrice(){
        return price;
    }


    public void setPrice(int price) {
        if (price < 500) {
            System.out.println(price);
        } else {
            System.out.println("too expensive");
        }
    }


}



