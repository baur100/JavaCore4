package HW10;

public class Cat {
    private String breed;
    private String catName;
    private int age;

    public Cat (){}

    public Cat (String breed, String catName, int age){
        this.breed = breed;
        this.catName = catName;
        this.age = age;
    }

    public void yearsTillDeath (){
        int result = 15-age;
        System.out.println("Your cat " + catName + " will die in " + result + " years.");
    }

    public void printInfo () {
        System.out.println("Name is: " + catName +
                "\nBreed is: " + breed +
                "\nAge is: " + age + " years");
    }

    public void setAge (int age){
        this.age = age;
    }
    public int getAge () {
        return age;
    }

    public void setCatName (String catName){
        this.catName = catName;
    }

    public String getCatName (){
        return catName;
    }

    public void setBreed (String breed){
        this.breed = breed;
    }

    public String getBreed (){
        return breed;
    }
}
