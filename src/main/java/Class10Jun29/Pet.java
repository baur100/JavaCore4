package Class10Jun29;

public class Pet {
    private String typeOf;
    private String name;
    private int age;

//    Constructors are used to set all the class variables in one block (as a replacement to setters)
    public Pet(String typeOf, String name, int age){
        this.age = age;
        this.name = name;
        this.typeOf = typeOf;
    }

    public void printInfo(){
        System.out.println("Pet name = "+name);
        System.out.println("Pet type = "+this.typeOf);
        System.out.println("Age = "+this.age);
    }

    public void setAge(int age){
        if(age>30 || age<0) {
            System.out.println("new age is wrong");
            System.out.println("Age will be set to 0");
            this.age =0;
        } else
            this.age = age;

    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }

}
