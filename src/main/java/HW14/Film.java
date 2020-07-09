package HW14;

public class Film {
    private String name;
    private int year;

    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Film (){}

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return this.name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
