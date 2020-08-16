package InterviewTasks;

public class PrimeNumbers {
    public static void main (String[] args){
//        System.out.println(isPrime(3));
        int limit = 111;
        printPrime(limit);

    }

    public static void printPrime (int limit){
        for (int i=2; i<=limit; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime (int a){
        for (int i = 2; i<a; i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
}
