package HM14;

public class AirCompany {
    private String name;
    private int yearOfFound;
    public AirCompany(String name, int yearOfFound ){
        this.name = name;
        this.yearOfFound = yearOfFound;
    }
    public String getName(){
        return name;
    }
    public int getYearOfFound(){
        return yearOfFound;
    }
}
