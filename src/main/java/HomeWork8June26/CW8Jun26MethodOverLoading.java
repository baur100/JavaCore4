package HomeWork8June26;

public class CW8Jun26MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(3.1,4.3));
        System.out.println(sum("Hello","Sir!"));
        System.out.println(sum('h','i'));
    }
    public static int sum(int a, int b){
    return a+b;
    }
    public static double sum(double x, double z){
        return x+z;
    }
    public static String sum(String c, String d){
        return c+" "+d;
    }
    public static String sum(char e, char f){
        return e+""+f+"!";
    }
}
