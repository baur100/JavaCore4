package hw9;

public class Carnivore {
    private String name;
    private String[] animals;
    private String prey;

    public Carnivore(String name, String[] animals, String prey) {
        this.name = name;
        this.animals = animals;
        this.prey = prey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAnimals() {
        return animals;
    }

    public void setAnimals(String[] animals) {
        this.animals = animals;
    }

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }

    public void printNow() {
        System.out.println("Name = " + this.name +"\nPrey = " + this.prey);
        for(String animals:this.animals){
            System.out.println(animals);
        }

    }
}
