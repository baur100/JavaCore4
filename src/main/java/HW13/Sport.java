package HW13;

public class Sport implements ToDoList {
    private String name;
    private int time;
    private boolean isPm;

    public Sport(String name, int time, boolean isPm) {
        this.name = name;
        this.time = time;
        this.isPm = isPm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isPm() {
        return isPm;
    }

    public void setPm(boolean pm) {
        isPm = pm;
    }

    @Override
    public void monday() {
        System.out.println("Monday is a jogging day! Woo-hoo");
    }

    @Override
    public void tuesday() {
        System.out.println("Tuesday is a day for gym!");
    }

    @Override
    public void wednesday() {
        System.out.println("Time to take some break.");
    }

    @Override
    public void thursday() {
        System.out.println("Yoga is today");
    }

    @Override
    public void friday() {
        System.out.println("Friday is chill day. No sport please");
    }

    @Override
    public void saturday() {
        System.out.println("We are doing morning hiking.");
    }

    @Override
    public void sunday() {
        System.out.println("Finally some rest");
    }
}
