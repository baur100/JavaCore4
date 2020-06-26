package HM7;

public class HM7 {
    public static void main(String[] args) {
        System.out.println(sum(2, 3, 5, 6, 7, 8));

        System.out.println("***********************************");

        int a[] = {3, 9, 1, 8, 4, 8, 5};
        int i;
        for (i = 0; i < a.length; i++)
            sort(a, a.length);
        System.out.println("Values after sorting:");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i] + "  ");
        }

        System.out.println("***********************************");

        int[] numbers = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(getMin(numbers));
    }

    public static int sum(int a, int b, int c, int d, int e, int f) {
        int result = a + b + c + d + e + f;
        return result;
    }
    private static void sort(int a[], int b) {
        for (int i = 1; i < b; i++) {
            int j = i;
            int c = a[i];
            while ((j > 0) && (a[j - 1] > c)) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = c;
        }
    }

    public static int getMin(int[]arr){
        int max = arr[0];
        for(int v:arr){
            if(v<max){
                max=v;
            }
        }
        return max;
    }

}
