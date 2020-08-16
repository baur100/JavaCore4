package InterviewTasks;

public class FizzBuzzTask {
    public static void main(String[] args) {
        int limit = 100;
        fizzBuzz(limit);
    }

    public static void fizzBuzz(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}


