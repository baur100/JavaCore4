package hw10hh;

public class Pandemic {
    private String name;
    private String origin;
    private int infected;
    private int year;

    public Pandemic() {}

    public Pandemic(String name, String origin, int infected, int year) {
        this.name = name;
        this.origin = origin;
        this.infected = infected;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public void setYear(int year) {
        if (year > 2020 || year < 0) {
            System.out.println("Error: Please enter a correct year");
            this.year = 2020;
        } else {
            this.year = year;
        }
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getInfected() {
        return infected;
    }

    public int getYear() {
        return year;
    }

    public void printInfo() {
        System.out.println("Pandemic Name: "+name+
                "\nOrigin: "+origin+
                "\nNumber of People Infected: "+infected+
                "\nYear: "+year);
    }
}
