package l8;

public class App2 {
    public static void main(String[] args) {

        int a=6;
        int b=7;

        System.out.println(sum(a,b));

        System.out.println(sum(1.1,4.3));

        System.out.println(sum("Hello","Students"));

        System.out.println(sum('a','c'));


    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static String sum(String a,String b){
        return a+" "+b;
    }
    public static String sum(char a, char b){
        return a+" "+b;
    }
}
