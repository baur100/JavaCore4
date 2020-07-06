package Hw11;

public class Recipe {
    private String flour;
    private String starter;
    private String cookingProcess;
    private int temp;
    private int cookingTime;



    public Recipe(String flour, String starter, String cookingProcess, int temp, int cookingTime) {
        this.flour = flour;
        this.starter = starter;
        this.cookingProcess = cookingProcess;
        this.temp = temp;
        this.cookingTime = cookingTime;

    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public String getCookingProcess() {
        return cookingProcess;
    }

    public void setCookingProcess(String cookingProcess) {
        this.cookingProcess = cookingProcess;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void printRecipe() {
        System.out.println("Recipe{" +
                "Flour used for this bread is " + this.flour +
                "\nStarter is " + this.starter + " in the cooking process" +
                "\nCooking procces is next: " + this.cookingProcess  +
                "\nThis bread is baked at " + this.temp + " degrees Farenheit" +
                "\nfor " + this.cookingTime + " minutes");
    }
}


