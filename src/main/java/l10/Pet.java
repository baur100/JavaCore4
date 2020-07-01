package l10;

public class Pet {
    private String typeof;
    private String name;
    private int age;

    public Pet(){}

    public Pet(String typeof, String name, int age){
        this.age=age;
        this.typeof=typeof;
        this.name=name;
    }

    public void printInfo(){
        System.out.println("Pet name = " + name);
        System.out.println("Pet type = " + this.typeof);
        System.out.println("Age = " + this.age);
    }

    public void setAge(int age){
        if(age>30 || age <0){
            System.out.println("new age is wrong");
            System.out.println("Age will be set as 0");
            this.age=0;
        } else {
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
}
