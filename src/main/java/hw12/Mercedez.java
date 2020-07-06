package hw12;

public class Mercedez extends Car{
    private String bodyNumber;
    public Mercedez(String modelName, String modelYear, String millage, String bodyNumber) {
        super(modelName, modelYear, millage);
        this.bodyNumber = bodyNumber;
    }

    public void printMercedez() {
        System.out.println("Mercedez{" +
                "bodyNumber='" + bodyNumber + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", millage='" + millage + '\'' +
                '}');
    }
}
