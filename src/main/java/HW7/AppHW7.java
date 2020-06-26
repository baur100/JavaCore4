package HW7;

import java.util.Arrays;

public class AppHW7 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arr));
        System.out.println("\n**********");

        int[] arr1 = {3,9,1,8,4,8,5};
        sort(arr1);
        System.out.println("\n**********");

        int[] arr2 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Min:" + getMin(arr2));


    }


    public static int sum(int[] array) {
        int sum = 0;
        for (int v : array) {
            sum = sum + v;
        }
        return sum;
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        for (int v:array){
            System.out.println(v);
        }
    }


    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}








