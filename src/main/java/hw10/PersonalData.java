package hw10;

public class PersonalData {
    private String name;
    private String lastName;
    private int age;



    public PersonalData(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }

    public PersonalData(){}


    public void printInfo(){
        System.out.println("First Name = "+name+"\nLast Name = "+lastName+"\nAge = "+age);
    }

    public void setName(){
        this.name=name;
    }

    public void getName(){
        this.name=name;
    }

    public void setLastName(){
        this.lastName=lastName;
    }

    public void getLastName(){
        this.lastName=lastName;
    }

    public void setAge(int i){
        if (age>20){
            System.out.println("You should consume 1000-1300 calories per day");
        }else {
            System.out.println("You should consume 1300-1800 calories per day");
        }
    }

    public int getAge(){
        return age;
    }


}
