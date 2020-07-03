package Hw10;

public class Singer {
    private String name;
    private String genre;
    private String bestSong;

    public Singer(String name, String genre, String bestSong) {
        this.name = name;
        this.genre = genre;
        this.bestSong = bestSong;

    }

    public Singer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBestSong(String bestSong) {

        this.bestSong = bestSong;
    }

     public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getBestSong() {
        return bestSong;
    }


    public void printOut() {
        System.out.println("This artist's name is  " + name + "\n" + name + "  performs in the "  + genre + " genre" + "\n" + name + " best song is  " + bestSong);
    }
}
