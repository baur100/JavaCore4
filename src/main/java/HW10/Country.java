package HW10;

public class Country {
    private String CountryName;
    private int Population;
    private String Language;

    public Country(String CountryName, int Population, String Language ){
        this.CountryName=CountryName;
        this.Population=Population;
        this.Language=Language;
    }

    public Country(){}

    public void printInfo(){
        System.out.println("Country: "+CountryName+"\ncurrent population: " + Population+" \nofficial language: "+ Language );
    }

    public void setCountryName(String CountryName){
        this.CountryName = CountryName;
    }

    public String getCountryName(){
        return CountryName;
    }

    public void setPopulation(int Population){
        this.Population= Population;
    }

    public int getPopulation(){
        return Population;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getLanguage() {
        return Language;
    }
}
