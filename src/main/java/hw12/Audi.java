package hw12;

public class Audi extends Car{
    private String bodyNumber;
    public Audi(String modelName, String modelYear, String millage, String bodyNumber) {
        super(modelName, modelYear, millage);
        this.bodyNumber = bodyNumber;
    }

    public void printAudi() {
        System.out.println("Audi{" +
                "bodyNumber='" + bodyNumber + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", millage='" + millage + '\'' +
                '}');
    }
}
