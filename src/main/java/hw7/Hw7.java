package hw7;

//public class Hw7 {
//        public static void main(String[] args) {

//                int [] arr= new int []{2, 3, 5, 6, 7, 8};
//                int sum = sum(arr);
//                System.out.println(sum);
//
//                int[] intArray = new int[]{3, 9, 1, 8, 4, 8, 5};
//                int sort = sort (v);
//                System.out.print(sort+" ");


//                int[] arr = {3, 9, 1, 8, 4, 8, 5};
//                System.out.println(min(arr));
//        }


//    1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//                invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result1.
//                Create function `sum` - which takes int[] as a param and returns sum of all
//                elements of the array.
//                invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result


//        public static int sum(int[] arr) {
//                int add = 0;
//                for (int v : arr) {
//                        add += add + v;
//                }
//                return (add);
//        }


//2. Create function sort - which takes  int[] as a param and print out sorted array
//        invoke it from main() - pass {3,9,1,8,4,8,5} as a param (this will be void func)


//        public static void sort(int[] intArray) {
//                for (int i = 0; i < intArray.length; i++) {
//                        for (int j = i + 1; j < intArray.length; j++) {
//                                if (intArray[i] > intArray[j]) {      //swap elements if not in order
//                                        temp = intArray[i];
//                                        intArray[i] = intArray[j];
//                                        intArray[j] = temp;
//                                }
//                                for (int i = 0; i < intArray.length; i++) {
//                                        System.out.print(intArray[i] + " ");
//                                }
//                        }
//                }


//3. Create a function  which takes int[] as a param and returns min of the array invoke it
//        from main() - pass {3,9,1,8,4,8,5} as a param


//                public static int min ( int[] arr){
//
//                        int min = arr[0];
//
//                        for (int v : arr) {
//
//                                if (v < min) {
//
//                                        min = v;
//
//                                }
//
//                        }
//
//                        return min;
//
//                }
//        }
//}