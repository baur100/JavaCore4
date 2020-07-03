package HW11;

public class Animal {
    private String AnimalName;
    private String Species;
    Features features;
    private String[] ShotsGiven;

    public Animal(String animalName, String species, Features features, String[] ShotsGiven) {
        this.AnimalName = animalName;
        this.Species = species;
        this.features = features;
        this.ShotsGiven = ShotsGiven;
    }

    public Animal(){}

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalName) {
        this.AnimalName = animalName;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        this.Species = species;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }
    public String[] getShotsGiven() {
        return ShotsGiven;
    }

    public void setShotsGiven(String[] shotsGiven) {
        this.ShotsGiven = shotsGiven;
    }

    public void info() {
        System.out.println(this.AnimalName + " is a " + this.Species + " , Currently " +
                this.features.getAge() + " years old weighing " +this.features.getWeight() + " pounds");

        for (String v:this.ShotsGiven){
            System.out.println("shots needed for " +this.AnimalName+ " is: " + v );

        }
    }

}
