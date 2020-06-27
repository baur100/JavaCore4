package hw7;

import java.util.Arrays;

public class hw7 {


//1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
//2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main() - pass {3,9,1,8,4,8,5} as a param (this will be void func)
//3. Create a function  which takes int[] as a param and returns min of the array invoke it from main() - pass {3,9,1,8,4,8,5} as a param


    public static void main(String[] args) {

//1
        int[] arr1 = {2,3,4,5,6,7,8};
        System.out.println(sum(arr1));

//2

        int[] arr2 = {3,9,1,8,4,5,8};
        System.out.println(arr2);

//3

        int[] arr3 = {3,9,1,8,4,8,5};
        int max = returnMax(vv[i]);
        System.out.println(max);

    }
    //1
    public static int sum(int[] arr) {
        int total = 0;
        for (int num:arr) {
            total = total + num;
        }
        return total;

    }

    //2
    public static int sort(int xx[]) {
        Arrays.sort(xx);

    }


//3

    public static int returnMax ( int[] vv) {
        int max = 0;
        for (int i = 0; i < vv.length; i++) {
            if (max > vv[i]) {
                max = vv[i];
            }
        }
        return max;

    }

}