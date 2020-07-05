package HW12;

public class Bestbydate {
    private String month;
    private int day;
    private int year;

    public Bestbydate(String month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Bestbydate(){}

    public void setDay (int day){
        this.day = day;
    }

    public void setMonth (String month){
        this.month = month;
    }

    public void setYear (int year){
        this.year = year;
    }

    public int getDay (){
        return this.day;
    }

    public String getMonth (){
        return this.month;
    }

    public int getYear (){
        return this.year;
    }

    public void printDate(){
        System.out.println("Best by " + month + ", " + day + " " + year);
    }
}
