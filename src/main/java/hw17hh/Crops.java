package hw17hh;

public class Crops {
    private String cropsName;
    private int cropsFieldNumber;

    public Crops(String cropsName, int cropsFieldNumber) {
        this.cropsName = cropsName;
        this.cropsFieldNumber = cropsFieldNumber;
    }

    @Override
    public String toString() {
        return "\n" + cropsName + " - " +
                cropsFieldNumber + " Fields";
    }

    public void printCrops() {
        System.out.println(toString());
    }
}
