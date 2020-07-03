package HW11;

public class App {
    public static void main(String[] args) {
        String[] Shots = {"parvo virus", "rabies", "Distember"};
        Features DogFeatures = new Features("black", 5, 20);
        Animal Dog = new Animal("Damian","dog",DogFeatures,Shots);
        Dog.info();
    }

}