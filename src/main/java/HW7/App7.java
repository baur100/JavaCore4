//1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
//2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main() - pass {3,9,1,8,4,8,5} as a param (this will be void func)
//3. Create a function  which takes int[] as a param and returns min of the array invoke it from main() - pass {3,9,1,8,4,8,5} as a param


package HW7;

public class App7 {
    public static void main(String[] args) {
        int[] b = {2, 3, 5, 6, 7, 8};
        int[] sorta = {3, 9, 1, 8, 4, 8, 5};
        int[] minarray = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(sum(b));
        System.out.println("********************************************");
        sort(sorta);
        System.out.println("********************************************");
        System.out.println(min(minarray));


    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int v : a) {

            sum = v + sum;
        }
        return sum;
    }


    public static void sort(int[] c) {
        int temporary;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {

                if (c[i] < c[j]) {
                    temporary = c[i];
                    c[i] = c[j];
                    c[j] = temporary;
                }


            }

        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }

    //{3,9,1,8,4,8,5};
    //{3,9,1,8,4,8,5}
    public static int min(int[] d) {
        int min = d[0];
        for (int v : d) {
            if (v < min) {
                min = v;
            }

        }
        return min;
    }


}






