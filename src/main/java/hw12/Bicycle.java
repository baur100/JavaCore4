package hw12;

public class Bicycle extends Vehicle {
    public String bicycleTransmission;

    public Bicycle(){}

    public Bicycle(String name, int wheels, String color, boolean engine, String type){
        super(name, wheels,color,engine);
        setBicycleTransmission(type);
    }

    public void setBicycleTransmission(String type){
        bicycleTransmission = type;
    }

    public String getBicycleTransmission(){
        return this.bicycleTransmission;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Bicycle transmission type : " + bicycleTransmission);
    }
}


