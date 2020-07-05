package HW12;

public class Eggs extends Produce{
    private int category;

    public Eggs(String name, Bestbydate bestby, int category) {
        super(name, bestby);
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void printEggs (){
        printProduceInfo();
        System.out.println("Category: " + category);
    }
}
