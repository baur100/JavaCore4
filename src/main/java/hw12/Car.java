package hw12;

public class Car extends Vehicle {
    private String typeBody;

    public Car(){}

    public Car(String name, int wheels, String color, boolean engine, String typeBody){
        super(name, wheels, color, engine);
        setTypeBody(typeBody);
    }

    public void setTypeBody(String typeBody){
        this.typeBody = typeBody;
    }

    public String detTypeBody(){
        return this.typeBody;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Type body : " + typeBody);
    }
}
