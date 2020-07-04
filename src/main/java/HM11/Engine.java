package HM11;

public class Engine {
    public int size;


    public Engine(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;

    }

    public void printEngine() {
        System.out.println("Engine= " + size);

    }
}
