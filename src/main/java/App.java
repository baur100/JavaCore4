public class App {
    public static void main(String[] args) {
        int ii = sum_of_three(1,4,5);
        int xx= sum_of_three(3,3,4);
        int vvv= sum_of_three(1,2,3);
        System.out.println(sum_of_three(1,1,1));
        System.out.println(sum_of_five(1,1,1,1,1));
        System.out.println(isOdd(6));
        hello("Maya");
        hello("Anna");
        hello("Jake");
        String dylan = heyhey("Dylan","Dow",22);
        System.out.println(dylan);
    }
    public static int sum_of_three(int a, int b, int c){
        int result = a+b+c;
        return result;
    }
    public static boolean isOdd(int x){
        boolean result= x%2==1;
        return result;
    }
    public static int sum_of_five(int a, int b, int c, int d, int e){
        int res= a+b+c+d+e;
        return res;
    }
    public static void hello(String name){
        System.out.println("Hello "+name);
    }
    public static String heyhey(String name, String lastName, int age){
        return "Hello "+name+" "+lastName + " I think today your Birthday!!!! - Happy "+age + "!!!!!!!";
    }
}

