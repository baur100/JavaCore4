package HW10;

public class Vegetable {
    private String vegetableName;
    private int Calories;
    private String VeggieColor;

    public Vegetable(String vegetableName, int Calories, String VeggieColor ){
        this.vegetableName=vegetableName;
        this.Calories=Calories;
        this.VeggieColor=VeggieColor;
    }

    public Vegetable(){}

    public void printInfo(){
        System.out.println("vegetable: "+vegetableName+"\nContains: " + Calories+" calories \nColor: "+ VeggieColor );
    }

    public void setVegetableName(String vegetableName){
        this.vegetableName = vegetableName;
    }

    public String getVegetableName(){
        return vegetableName;
    }

    public void setCalories(int Calories){
        this.Calories= Calories;
    }

    public int getCalories(){
        return Calories;
    }

    public void setVeggieColor(String VeggieColor) {
        this.VeggieColor = VeggieColor;
    }

    public String GetVeggieColor() {
        return VeggieColor;
    }

}
