package hw10;

public class DietInfo {
    private String typeOfFood;
    private String whichMeal;
    private int calories;

    public DietInfo (String typeOfFood, String whichMeal, int calories){
        this.typeOfFood=typeOfFood;
        this.whichMeal=whichMeal;
        this.calories=calories;
    }

    public DietInfo(){}

    public void printDietInfo(){
        System.out.println("Type of Food = "+typeOfFood+"\nConsuming = "+whichMeal+"\nCalories = "+calories);
    }

    public void setTypeOfFood(){
        if (typeOfFood=="Beef"){
            System.out.println("This is good for calories!");
        }else {
            System.out.println("This food is bad for your health");
        }
    }

    public void getTypeOfFood(){
        this.typeOfFood=typeOfFood;
    }

    public void setwhichMeal(){
        if (whichMeal=="Supper") System.out.println("You have one more meal left for the day");
        else {
            System.out.println("You cannot eat anymore!");
        }
    }

    public String getwhichMeal(){
        return whichMeal;
    }

    public void setCalories(int i){
        if (calories>1700){
            System.out.println("You are under your calorie limit!");
        }else {
            System.out.println("You are eating too much!");
        }
    }

    public int getCalories() {
        return calories;
    }



}
