package hw10Constractors;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car () {}

    public Car (String m, String mo, int y){
        make = m;
        model = mo;
        year = y;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getMake () {
        return make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel (){
        return model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public void printInfo (){
        System.out.println("Car make ="+make);
        System.out.println("Car model ="+model);
        System.out.println("Car year ="+year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

