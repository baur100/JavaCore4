package l13Hw;

public class App {
    public static void main(String[] args) {
        Multiplication multipliedNum1 = new Multiplication(5);
        multipliedNum1.calculate();
        multipliedNum1.setMultipliedNum(6);
        multipliedNum1.calculate();

        Calculation multipliedNum2 = new Multiplication(7);
        multipliedNum2.calculate();

    }
}
