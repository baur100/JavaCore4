package l8;

public class App {
    public static void main(String[] args) {
        int border = 50;
        getPrimeNumbers(border);
    }

    public static void getPrimeNumbers(int b) {
        for(int i=2;i<=b;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

//2,3,5,7,11,13,17,19,23
}
