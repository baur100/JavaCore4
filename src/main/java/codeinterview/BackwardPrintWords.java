package codeinterview;

public class BackwardPrintWords {
    public static void main(String[] args) {
        String test = "Hello today is a very good day lets hangout";
        backwardPrint(test);
    }

    private static void backwardPrint(String test) {
        String[] words = test.split(" ");
        for (int i = words.length-1; i>=0;i--){
            System.out.print(words[i]);
            System.out.print(" ");
        }
    }

}
