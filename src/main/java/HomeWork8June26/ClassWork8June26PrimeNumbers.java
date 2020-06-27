package HomeWork8June26;

public class ClassWork8June26PrimeNumbers {

    public static void main(String[] args) {
        int border = 50;
        getPrimeNumbers(border);
    }

    public static void getPrimeNumbers(int b){
        for(int i = 2; i<=b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    //Prime numbers<50 = 2,3,5,7,11,13,17,19,23...etc.
    public static boolean isPrime(int number){
        for (int i=2; i<number-1;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
