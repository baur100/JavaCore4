package HW11;

public class Movie {

    private String name;
    private String genre;
    private int howLong;

    public Movie(String name, String genre, int howLong) {

        this.name = name;
        this.genre = genre;
        this.howLong = howLong;
    }

    public Movie () {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    public void printIt() {

        System.out.println("The movie is: " + name + "\nIt's a " + genre + "\nIt lasts for " + howLong);
    }
}
