package HW15;

public class Hour implements Time{
    private int Hours;

    public Hour(int Hours) {
        this.Hours = Hours;

    }

    @Override
    public double getSeconds() {
        return this.Hours * 60 * 60;
    }
}


