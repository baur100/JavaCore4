package hw12;

public class Country {
  private String continent;
  private String name;
  private String currency;

  public Country(String continent, String name, String currency) {
    this.continent = continent;
    this.name = name;
    this.currency = currency;
  }

  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void printCountryInfo(){
    System.out.println(this.name+ " is in " +this.continent +" continent. Their currency is " +this.currency);
  }
}
