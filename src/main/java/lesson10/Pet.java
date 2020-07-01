package lesson10;

public class Pet {
    private String typeOf;
    private String name;
    private int age;

    //The following line is the default constructor
    public Pet(){}

    // lets create a constructor
    public Pet(String typeOf, String name, int age){
        this.typeOf=typeOf;
        this.name=name;
        this.age=age;
    }

    public void printInfo(){
        System.out.println("Pet name = " + name);
        System.out.println("Pet type = " + this.typeOf);
        System.out.println("Age = " + this.age);
    }

    //This is setter
    public void setAge(int age){
        if (age>30 || age <0){
            System.out.println("New age is wrong!");
            System.out.println("Age will be set to 0");
            this.age=0;
        }else {
            this.age=age;
        }
//        this.age=age;
    }

    //getter
    public int getAge() {
        return age;
    }
}
