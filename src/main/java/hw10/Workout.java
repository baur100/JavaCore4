package hw10;

public class Workout {
    private String week;
    private String month;
    private int skipDays;

    public Workout(String week, String month, int skipDays){
        this.week=week;
        this.month=month;
        this.skipDays=skipDays;
    }

    public Workout(){}

    public Workout(String monthly, int skipDays){
        this.month=month;
        this.skipDays=skipDays;
    }


    public void printWorkoutInfo(){
        System.out.println("Week = "+week+ "\nMonth = "+month+"\nDays Skipped = "+skipDays);
    }

    public void setWeekly(){
        this.week=week;
    }

    public void getWeekly(){
        this.week=week;
    }

    public void setMonthly(){
        this.month=month;
    }

    public void getMonthly(){
        return;
    }

    public void setSkipDays(int i){
        if (skipDays<5){
            System.out.println("You are doing grate!");
        }else {
            System.out.println("Don't skip!");
        }
    }

    public int getSkipDays(){
        return skipDays;
    }
}
