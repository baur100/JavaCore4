package InterviewTasks;

public class Remainders {
    public static void main (String[] args){
        int limit = 100;
        System.out.println(remainderModulus(100, 100));
        System.out.println(remainder1(100, 100));
        System.out.println(remainder2(100,100));
    }

    public static int remainderModulus (int a, int b){
        return a%b;
    }

    public static int remainder1(int a, int b){
        int c = a/b;
        return a-b*c;
    }

    public static int remainder2(int a, int b){
        if (a<b){
            return a;
        }
        while (a>=b){
            a=a-b;
        }
        return a;
    }
}
