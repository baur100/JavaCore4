package l13Hw;

public class Multiplication implements Calculation {
    private int multipliedNum;

    public Multiplication(int multipliedNum) {
        this.multipliedNum = multipliedNum;
    }

    public int getMultipliedNum() {
        return multipliedNum;
    }

    public void setMultipliedNum(int multipliedNum) {
        this.multipliedNum = multipliedNum;
    }

    @Override
    public int calculate() {
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d", multipliedNum,i,i* multipliedNum).println();
        }
        return 0;
    }


}
