package Lesson7hw;

import java.util.Arrays;

public class Lesson7hwApp {
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 5, 6, 7, 8};
        int[] arr2 = {3, 9, 1, 8, 4, 8, 5};
        int[] arr3 = {3, 9, 1, 8, 4, 8, 5};

        System.out.println(getSum(arr1));

        System.out.println("******************************");

        getSorted(arr2);

        System.out.println("******************************");

        int minResult = getMin(arr3);
        System.out.println(minResult);

    }

    public static int getSum (int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return sum;
    }

    public static void getSorted (int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int getMin (int[] arr) {
        int min = arr[0];
        for (int v : arr) {
            if (min > v) {
                min = v;
            }
        }
        return min;
    }
}
