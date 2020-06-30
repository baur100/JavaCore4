package Homework10;

public class Candy {
    private String type;
    private String flavor;
    private int calories;

    public Candy(String type, String flavor, int calories){
        this.type = type;
        this.flavor = flavor;
        this.calories = calories;
    }

    public void printCandyInfo() {
        System.out.println("Type = " + type);
        System.out.println("Flavor = " + flavor);
        System.out.println("Calories = " + calories);
    }

    public void setType(String newType){
        this.type = newType;
    }

    public String getType(){
        return this.type;
    }

    public void setFlavor(String newFlavor){
        this.flavor = newFlavor;
    }

    public String getFlavor(){
        return this.flavor;
    }

    public void setCalories(int newCalories){
        this.calories = newCalories;
    }

    public int getCalories(){
        return this.calories;
    }
}

