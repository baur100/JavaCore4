package hw13;

public class Bicycle implements Speed {

    private String model;
    private String color;

    public Bicycle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public int getSpeed() {
        System.out.println(model);
        System.out.println(color);
        return 0;

    }
}
