package Homework7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[]arr1 = {2,3,5,6,7,8};
        System.out.println(sum(arr1));

        System.out.println("*********************");

        int[]arr2 = {3,9,1,8,4,8,5};
        sort(arr2);

        System.out.println("*********************");

        int[]arr3 = {3,9,1,8,4,8,5};
        System.out.println(getMin(arr3));
    }

    public static int sum(int[]arr){
        int sum = 0;
        for(int v:arr){
            sum = sum + v;
            }
        return sum;
    }

    public static void sort(int[]arrayToSort){
        Arrays.sort(arrayToSort);
        for (int v : arrayToSort){
            System.out.println(v);
        }
    }

    public static int getMin(int[]arr){
        int min = arr[0];
        for(int v:arr){
            if(v<min){
                min=v;
            }
        }
        return min;
    }
}
