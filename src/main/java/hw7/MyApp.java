package hw7;

public class MyApp {
    public static void main(String [] args){
        int[] arr = {2,3,5,6,7,8};
        int sum = sum(arr);
        System.out.println("Sum: " + sum);
        int [] arr2 = {3,9,1,8,4,8,5};
        sort(arr2);
        System.out.print("[" +arr2[0]);
        for(int i=1; i<=arr.length; i++){
            System.out.print(", " + arr2[i]);
        }
        System.out.println("]");
        int min = min(arr2);
        System.out.println("Min: " + min);
    }
    public static int sum(int []arr) {
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
    public static void sort(int [] arr){
        for(int idx = 0; idx<arr.length-1;idx++){
            int idxSmallest = idx;
            for(int i = idx+1; i<arr.length; i++){
                if(arr[i]<arr[idxSmallest]){
                    idxSmallest = i;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[idxSmallest];
            arr[idxSmallest] = temp;
        }
    }
    public static int min(int[]arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(i<min){
                min = arr[i];
            }
        }
        return min;
    }
}
