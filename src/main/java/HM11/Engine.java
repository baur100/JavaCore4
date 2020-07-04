package HM11;

public class Engine {
    private double size;


    public Engine(double size) {
        this.size = size;
    }

    public Engine(){}

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void printEngine(){
        System.out.println(
                "Engine size= " + size);

    }
}
