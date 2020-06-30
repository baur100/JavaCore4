package repeatHW7;

import java.util.Arrays;

public class HW7Repeat {
    public static void main(String[] args) {
    int []a = {1,4,5,6,1};
    int sum = sum (a);
        System.out.println(sum);

        sort (a);

        int min1 = min (a);
        System.out.println(min1);
    }
    public static int sum ( int[] arrayOfIntMumb){
        int result = 0;
        for (int value: arrayOfIntMumb){
            result = result+value;
        }
        return result;
    }
    public static void sort ( int[] arrayToSortAndPrint){
        Arrays.sort(arrayToSortAndPrint);
        for (int v: arrayToSortAndPrint){
            System.out.println(v);

        }
    }
    public static int min (int[]a){
        int min = a[0];
        for (int v: a){
        if (v<min){
            min=v;
        }
        }
        return min;
    }


}
