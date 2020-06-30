package practice;

public class Practice {
        public static void main(String[] args) {
            int border = 100;
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
}
