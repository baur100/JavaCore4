package hw10Constractors;

public class Person {
    private String name;
    private String lastName;
    private int year;
    private Pet pet;

           public Person () {}

    public Person (String n, String l, int y, Pet pet){
    name = n;
    lastName = l;
    year = y;
    this.pet = pet;
    }
    public void setName(String name){
            this.name = name;

    }
    public void setLastName(String lastName){
            this.lastName = lastName;
    }
    public void setYear (int year){
            this.year = year;
    }
    public String getName (){
               return name;
    }
    public String getLastName (){
               return lastName;
    }
    public int getYear () {
               return year;
    }

    public void credentials () {
        System.out.println("Name = " + name + "\nlastName = " + lastName + "\nYear = "+year+"\nPet=" +pet.getNickname());
    }
    public void credentials1 () {
        System.out.println("Name = " + name + "\nlastName = " + lastName + "\nYear = "+year);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", pet=" + pet +
                '}';
    }
}


