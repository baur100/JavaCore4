package HW;

public class PrimeNumber {

  public static void main(String[] args) {
    int boulder = 50;
    getPrimeNumber(boulder);
    

  }


  public static void getPrimeNumber(int number){
    for(int i=2; i<number; i++) {
      if (isPrime(i)) {
        System.out.println("This is prime number: " + i);
      }

    }
  }
  public static boolean isPrime(int number){
    for(int i =2; i<number; i++) {
      if ((number % i == 0)) {
        return false;
      }
    }
    return true;
  }

}
