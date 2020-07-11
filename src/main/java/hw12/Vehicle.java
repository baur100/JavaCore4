package hw12;

public class Vehicle {
    protected int howManyWheels;
    protected String color;
    protected boolean engine;
    protected String name;

    public Vehicle(){}

    public Vehicle(String name, int wheels, String color, boolean engine){
        setName(name);
        setWheels(wheels);
        setColor(color);
        setEngine(engine);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountWheels(){
        return this.howManyWheels;
    }

    public boolean getEngine(){
        return this.engine;
    }

    public String getColor(){
        return this.color;
    }

    public void setWheels(int howManyWheelswheels){
        this.howManyWheels = howManyWheelswheels;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setEngine(boolean engine){
        this.engine = engine;
    }

    public void printInfo(){
        System.out.print("Vechicle name : " + this.name + " with " + this.howManyWheels + " wheels, ");
        if(getEngine()) {
            System.out.print("engine, ");
        }
        System.out.println(this.color + " color.");
    }

}
