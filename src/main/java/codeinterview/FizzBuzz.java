package codeinterview;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz(200);

    }
    public static void fizzbuzz(int limit){
        for(int i =1; i<limit;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else {
                if(i%3==0){
                    System.out.println("Fizz");
                } else {
                    if(i%5==0){
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
