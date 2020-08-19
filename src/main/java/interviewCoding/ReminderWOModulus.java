package interviewCoding;

public class ReminderWOModulus {

    public static void main(String[] args) {
        System.out.println("Integer Remainder via division and subtraction: "+remainder1(11,3));
        System.out.println("Integer Remainder via subtraction: "+remainder2(11,3));
        System.out.println("Double Remainder via subtraction: "+remainder3(11,3));
        System.out.println();
        System.out.println("Integer Remainder via division and subtraction: "+remainder1(1,3));
        System.out.println("Integer Remainder via subtraction: "+remainder2(11,13));
        System.out.println("Double Remainder via subtraction: "+remainder3(11,23));
    }

    public static int remainder1(int a, int b){
       if(a<b)
           return a;
        int c = a/b;
        return a-(c*b);
    }

    public static int remainder2(int a, int b){
        if(a<b)
            return a;
        while(a>b)
           a = a-b;
        return a;
    }

    public static double remainder3(double a, double b){
        if(a<b)
            return a;
        while(a>b)
            a=a-b;
        return a;
    }

}
