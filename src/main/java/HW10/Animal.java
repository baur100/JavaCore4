package HW10;

public class Animal {

    private String name;
    private String breed;
    private int age;

    public Animal(String name, String breed, int age) {

       this.name = name;
       this.breed = breed;
       this.age = age;

    }

    public void setName() {

        this.name = name;
    }

    public void setSex() {

        this.breed = breed;
    }

    public void setYear() {

        this.age = age;
    }

    public String getName() {

        return name;

    }

    public String getSex() {

        return breed;
    }

    public int getYear() {

        return age;

    }
    public void printOut() {

        System.out.println("Cat's name= " + name + "\nCat's breed= " + breed + "\nCat's age= " + age);
    }

}


