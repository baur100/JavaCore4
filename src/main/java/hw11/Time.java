package hw11;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void printInfo(){
        System.out.println(this.hour + ":" + this.minute);
    }
}
