package interviewCoding;

public class PrimeNumbers {

    public static void main(String[] args) {
        printAllPrimeNumbers(200);
        System.out.println();
        printPrime(19);
    }

    private static void printAllPrimeNumbers(int input) {
        for (int i = 2; i <=input; i++) {
            if (isPrimeNumber(i))
                System.out.println("printPrimeNumber: " + i);
        }
    }

    private static boolean isPrimeNumber(int checkPrime) {
        for (int i = 2; i < checkPrime; i++) {
            if (checkPrime%i == 0)
                return false;
        }
        return true;
    }

    private static void printPrime(int primeNumber){
            if(isPrime(primeNumber))
                System.out.println(primeNumber);

    }

    private static boolean isPrime(int primeNo) {
        for (int i = 2; i < primeNo; i++) {
            if (primeNo % i == 0)
                return false;
        }
        return true;
    }

}
