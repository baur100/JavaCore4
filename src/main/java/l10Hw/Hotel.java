package l10Hw;

public class Hotel {
    private String name;
    private   int numOfStars;
    private   int price;

    public Hotel(){}

    public Hotel(String name, int numOfStars, int price){
        this.name = name;
        this.numOfStars = numOfStars;
        this.price = price;
    }

    public void getInfo(){
        System.out.println("You get the best price!");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfStars(){
        return this.numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
