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

        if (model.equals("XXX")) {
            System.out.println("right model");
        }else
        System.out.println("wrong model");

       return 0;

    }

}
