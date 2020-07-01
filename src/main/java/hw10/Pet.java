package hw10;

public class Pet {
    private String typeOfPet;
    private String name;
    private int numberOfPet;

    public Pet (String typeOfPet, String name, int numberOfPet){
        this.typeOfPet=typeOfPet;
        this.name=name;
        this.numberOfPet=numberOfPet;
    }

    public Pet (String name){
        this.name=name;
    }

    public Pet(){}

    public void petInfo(){
        System.out.println("Type of Pet = "+typeOfPet+"\nName = "+name+"\nNumber of Pet = "+numberOfPet);
    }

    public void setTypeOfPet(){
        this.typeOfPet=typeOfPet;
    }

    public void getTypeOfPet(){
        this.typeOfPet=typeOfPet;
    }

    public void setName(){
        if (this.name=="Cat"){
            System.out.println("This is a Cat!");
        }else {
            this.name=name;
        }
    }

    public void getName(){
        this.name=name;
    }

    public void setNumberOfPet(int i){
        if (numberOfPet<=1){
            System.out.println("I am going to adopt this Cat");
        }else {
            System.out.println("I cannot adopt this Cat");
        }
    }

    public int getNumberOfPet(){
        return numberOfPet;
    }
}
