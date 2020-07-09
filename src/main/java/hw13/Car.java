package hw13;

public class Car implements Speed {

    private String model;
    private int year;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int getSpeed() {
        System.out.println(model);
        System.out.println(year);
        return 0;

    }

}
