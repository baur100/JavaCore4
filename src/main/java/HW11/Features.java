package HW11;

public class Features {
    private String AnimalColor;
    private int age;
    private int weight;

    public Features(String animalColor, int age, int weight) {
        this.AnimalColor = animalColor;
        this.age = age;
        this.weight = weight;
    }

    public String getAnimalColor() {
        return AnimalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.AnimalColor = animalColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



}

