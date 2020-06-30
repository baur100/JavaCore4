package HW10;

public class Course {
    private String dishTitle;
    private String type;
    private int calories;

    public Course (){}

    public Course (String dishTitle, String type, int calories){
        this.dishTitle = dishTitle;
        this.type = type;
        this.calories = calories;
    }

    public void myOrder (String drink){
        System.out.println("Let me get " + dishTitle + " as " + type + ". \nAnd I will also take " + drink + ".");
    }

    public void printInfo (){
        System.out.println("This dish is called " + dishTitle +"."+
                "\nIts course type is " + type + " and it only has " + calories + " calories in it.");
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public int getCalories(){
        return calories;
    }

    public void setDishTitle(String dishTitle){
        this.dishTitle = dishTitle;
    }

    public String getDishTitle (){
        return dishTitle;
    }

    public void setType (String type){
        this.type = type;
    }

    public String getType (){
        return type;
    }

}
