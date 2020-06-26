import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {
    //1)
        int[] numbers = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(numbers));

        System.out.println("****************");
    //2)
        int[] values = {3, 9, 1, 8, 4, 8, 5};
        sort(values);

        System.out.println("****************");
    //3)
        int[] row = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(getMin(row));

    }
    //1)
    public static int sum ( int[] arr){
            int sum = 0;
            for (int v : arr)
                sum += v;
            return sum;
        }

    //2)
    public static void sort ( int[] arr){
            Arrays.sort(arr);
        for (int value : arr)
            System.out.println(value);

    }

    //3)
    public static int getMin ( int[] arr){
            int min = arr[0];
            for (int v : arr) {
                if (v < min) {
                    min = v;
                }
            }
            return min;
    }
}
