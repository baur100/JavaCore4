package HomeWork7;

import java.util.Arrays;

public class HomeWorkDay7Lesson7 {

    public static void main(String[] args) {
        //Q1. Sum of Arrays
        int[] inputQ1 = {2,3,5,6,7,8};
        System.out.println("\nSum of the values of the arrays: "+sum(inputQ1));

        //Q2. Sort in ascending and descending order
        int[] inputQ2 = {3, 9, 1, 8, 4, 8, 5};
        sortAscending(inputQ2);
        sortDescending(inputQ2);
        //HomeWorkDiscussion - Array Sort Type
        sort(inputQ2);

        //Q3. Print min value from the given array
        int[] inputQ3 = {3,9,1,8,4,8,5};
        System.out.println("\n\nThe min value from the given array is: "+min(inputQ3));

    }

    /*
    * Array sorting method discussed in HomeWork session
    */
    public static void sort(int[] arrayToSort){
        Arrays.sort(arrayToSort);
        System.out.print("\n\nSorted Array:");
        for (int sort:arrayToSort) {
            System.out.print(" "+sort+" ");
        }
    }

    /*
    1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
    Invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
    */
    public static int sum(int[] inpArr) {
        int sumOfValues = 0;
        for (int a : inpArr) {
            sumOfValues = sumOfValues + a;
        }
        return sumOfValues;
    }

    /*
    Swap Method to Sort the array values
     */
    public static void swap(int[]arrToSort, int i,int j){
        int temp = 0;
        temp = arrToSort[j];
        arrToSort[j] = arrToSort[i];
        arrToSort[i] = temp;
    }

    /*
    2.a. Create function 'sort' in Ascending- which takes  int[] as a param and print out sorted array invoke it from main() -
    pass {3,9,1,8,4,8,5} as a param (this will be void func)
    */
    public static void sortAscending(int[] inAsc) {
        int temp = 0;
        System.out.print("\nThe array sorted in Ascending order is: ");
        for (int i = 0 ; i < inAsc.length ; i++){
            for (int j = 0 ; j < inAsc.length-1 ; j++){
                if(inAsc[j]>inAsc[i])
                  swap(inAsc,i,j);
            }
        }
        System.out.print("\nSort in ascending order: ");
        for (int k : inAsc) {
            System.out.print(" " + k + " ");
        }
    }

    /*
    2.b. Create function 'sort' in Descending- which takes  int[] as a param and print out sorted array invoke it from main() -
    pass {3,9,1,8,4,8,5} as a param (this will be void func)
    */
    public static void sortDescending(int[] inDesc){
        int temp = 0;
        System.out.print("\n\nThe array sorted in Descending order is: ");
        for(int l = 0 ; l < inDesc.length ; l++){
            for(int m = 0; m < inDesc.length-1 ; m++){
                if(inDesc[m]<inDesc[l])
                    swap(inDesc,l,m);
            }
        }
        System.out.print("\nSort in descending order: ");
        for (int k : inDesc) {
            System.out.print(" " + k + " ");
        }
    }

    /*
    3. Create a function min which takes int[] as a param and returns min of the array invoke it from main() -
    pass {3,9,1,8,4,8,5} as a param
    */
    public static int min(int[] inputArr){
            int minValue = inputArr[0];
            for (int d : inputArr) {
                if (minValue > d)
                    minValue = d;
            }
            return minValue;
        }
}
