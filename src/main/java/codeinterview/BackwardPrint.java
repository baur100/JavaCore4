package codeinterview;

public class BackwardPrint {
    public static void main(String[] args) {
        String test = "I'm a string to be tested!";
        backwardPrint(test);
        System.out.println();
        backwardPrint1(test);
    }

    private static void backwardPrint1(String test) {
        char[] arr = test.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }

    private static void backwardPrint(String test) {
        for(int i=test.length()-1;i>=0;i--){
            System.out.print(test.charAt(i));
        }
    }
}
