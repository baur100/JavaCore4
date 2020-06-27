package bhw7;

import java.util.Arrays;

public class Hw {
    public static void main(String[] args) {
        int[]a = {1,4,5,6,1};

//        System.out.println(a);

        int sum = sum(a);
        System.out.println(sum);

        sort(a);

        int minOfArray = min(a);
        System.out.println(minOfArray);
    }
    public static int sum(int[]arrayOfIntegerNumbers){
        int result=0;
        for(int value : arrayOfIntegerNumbers){
            result=result+value;
        }
        return result;
    }

    public static void sort(int[]arrayToSortAndPrint){
        Arrays.sort(arrayToSortAndPrint);
        for (int v:arrayToSortAndPrint){
            System.out.println(v);
        }
    }
    public static int[] sort2(int[]aa){
        Arrays.sort(aa);
        return aa;
    }

    public static int min(int[]a){
        int min=a[0];
        for(int v:a){
            if(v<min){
                min=v;
            }
        }
        return min;
    }

}
