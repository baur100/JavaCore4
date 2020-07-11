package hw15hh;

public class City {
    private String name;
    private double population;

    public City(String name, double population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " " + population +"m";
    }

    public void printCity() {
        System.out.println(toString());
    }
}
