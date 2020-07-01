package HM10;

public class Country {
    private String name;
    private String abbreviation;
    private double population;


    public Country(String name, double population, String abbreviation){
        this.name=name;
        this.abbreviation=abbreviation;
        this.population=population;
    }


    public void printInfo(){
        System.out.println("Full county name is " + name + "\n" + "Population is " + population + "\n" + "Abbreviation is "+ abbreviation );
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getPopilation() {

        return population;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
