package codeinterview;

public class PrimeNumber {
    public static void main(String[] args) {
        int limit = 200;
        printPrime(limit);

    }

    private static void printPrime(int limit) {
        for (int i = 2; i<limit; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int a) {
        for (int i = 2; i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
