package l10Hw;

public class Grain {
    private String type;
    private int calories;
    private String color;

    public Grain(){}
    public Grain(String type, int calories, String color){
        this.calories = calories;
        this.color = color;
        this.type = type;
    }
    public void getInfo(){
        System.out.println(this.type + " is useful, " + this.color + " color grain, with " + this.calories + " calories per 100 g.");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
