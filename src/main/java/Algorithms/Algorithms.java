package Algorithms;

public class Algorithms {
    public static void main (String[]args){
// // //  //    FizzBuzz
        for (var i=1; i<100; i++){
            fizzBuzz(i);
        }
    }

    private static void fizzBuzz(int i) {
        if (i%15==0){
            System.out.println(i+ " FizzBuzz");
        }
        else {
            if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else {
                if (i % 5 == 0) {
                    System.out.println(i + " Buzz");
                }
            }
        }
    }
}
