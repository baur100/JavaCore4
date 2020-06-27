package hw7;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {
        //q1. Array Sum
        int[] i1 = {1, 2, 6, 4, 8};
        int sum = sum(i1);
        System.out.println("\nSum of the array values: " + sum);
        sort(i1);

        int minofArray= min(i1);
        System.out.println(minofArray);

    }
    public static int sum(int [] arrayofIntegerNumbers) {
        int final=0;
        for (int v : arrayofIntegerNumbers) {
            final=final+v;
        }
        return final ;
    }

    public static void sort(int[]arrayToSortAndPrint){
        Arrays.sort(arrayToSortAndPrint);
        for (int v : arrayToSortAndPrint) {
            System.out.println(v);
        }
        }

        public static int min(int[]a){
            int min=a[0];
            for (int v:a);
    {
        if (v < min) {
            min = v;
        }
    }
            return min;
                }
    }



