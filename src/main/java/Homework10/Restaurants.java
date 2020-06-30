package Homework10;

public class Restaurants {
    private String specialty;
    private String location;
    private int rating;

    public Restaurants(String specialty, String location, int rating){
        this.specialty = specialty;
        this.location = location;
        this.rating = rating;
    }

    public void printRestaurantInfo() {
        System.out.println("Specialty = " + specialty);
        System.out.println("Location = " + location);
        System.out.println("Rating = " + rating);
    }

    public void setSpecialty(String newSpecialty){
        this.specialty = newSpecialty;
    }

    public String getSpecialty(){
        return this.specialty;
    }

    public void setLocation(String newLocation){
        this.location = newLocation;
    }

    public String getLocation(){
        return this.location;
    }

    public void setRating(int newRating){
        this.rating = newRating;
    }

    public int getRating(){
        return this.rating;
    }
}