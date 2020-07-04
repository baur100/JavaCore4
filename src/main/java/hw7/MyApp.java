package hw7;

import java.util.Arrays;

public class MyApp {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arr));
        System.out.println("------------------------------");

        int[] arr1 = {3, 9, 1, 8, 4, 8, 5};
        sort(arr1);
        System.out.println("------------------------------");
        System.out.println(getMin(arr1));
    }

    public static int sum(int[] arr) {
        int result = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5];
        return result;
    }

    public static void sort(int[] arr1) {
        Arrays.sort(arr1);
        for (int v : arr1) {
            System.out.println(v);
        }
    }

    public static int getMin(int[] arr1) {
        int min = arr1[0];
        for (int v : arr1) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}

