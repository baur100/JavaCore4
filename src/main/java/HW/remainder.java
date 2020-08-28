package HW;

public class remainder {
  public static void main(String[] args) {
    System.out.println( remainder(7, 25));

  }

  public static int remainder (int a, int b){
      int d = 0;
      if(a>=b){
      d = a / b;
      }
      return a-(b*d);
  }

}
