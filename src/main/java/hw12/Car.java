package hw12;

public class Car {
    protected String modelName ;
    protected String modelYear;
    protected String millage;

    public Car(String modelName, String modelYear, String millage) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.millage = millage;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getMillage() {
        return millage;
    }

    public void setMillage(String millage) {
        this.millage = millage;
    }
}
