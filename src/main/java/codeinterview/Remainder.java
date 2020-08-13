package codeinterview;

public class Remainder {
    public static void main(String[] args) {
        System.out.println(97%25);
        int remainder = remainder(97, 25);
        System.out.println(remainder);
        int remainder1 = remainder1(97, 25);
        System.out.println(remainder1);
    }

    private static int remainder1(int a, int b) {
        int c = a/b;
        return a-c*b;
    }

    private static int remainder(int a, int b) {
        if(a<b){
            return a;
        }
        while(a>=b){
            a=a-b;
        }
        return a;
    }
}
