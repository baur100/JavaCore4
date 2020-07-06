package Homework12;

public class Basketball {
    protected String name;
    protected String lastName;
    protected String city;
    protected String championships;

    public Basketball(String name, String lastName, String city, String championships) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.championships = championships;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getChampionships() {
        return championships;
    }

    public void setChampionships(String championships) {
        this.championships = championships;
    }
}
