package hw10hh;

public class Insects {
    private String name;
    private String color;
    private String food;

    public Insects() {}

    public Insects(String name, String color, String food) {
        this.name = name;
        this.color = color;
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void printInfo() {
        System.out.println("Insect Name = "+name+
                "\nColor = "+color+
                "\nEdible = "+food);
    }
}
