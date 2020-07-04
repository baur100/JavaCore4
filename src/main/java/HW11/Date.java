package HW11;

public class Date {
    private String month;
    private int day;
    private int year;

    public Date (String month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date (){}

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
        System.out.println(month + ", " + day + " " + year);
    }
}
