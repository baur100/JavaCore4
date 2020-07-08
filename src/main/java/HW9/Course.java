package HW9;

public class Course {
    public String dishTitle;
    public String type;
    public int calories;

    public void myOrder (String drink){
        System.out.println("Let me get " + dishTitle + " as " + type + ". And I will also take " + drink + ".");
    }
}
