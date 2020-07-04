package Homework11;

public class Caffeine {
    private boolean isCaffeine;

    public Caffeine(boolean hasCaffeine) {
        this.isCaffeine = hasCaffeine;
    }

    public Caffeine(){}

    public void printCaffeine() {
        if (isCaffeine) {
            System.out.println("This drink has caffeine");
        } else {
            System.out.println("This drink has no caffeine");
        }
    }
}
