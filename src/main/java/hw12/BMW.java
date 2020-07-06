package hw12;

public class BMW extends Car{
    private String bodyNumber;
    public BMW(String modelName, String modelYear, String millage, String bodyNumber) {
        super(modelName, modelYear, millage);
        this.bodyNumber = bodyNumber;
    }
    public void printBMW() {
        System.out.println("BMW{" +
                "bodyNumber='" + bodyNumber + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", millage='" + millage + '\'' +
                '}');
    }
}
