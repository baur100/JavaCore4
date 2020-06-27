package l7;

public class App {
    public static void main(String[] args) {

        sayHelloToYou();
        int[]arr1 = { 1,2,4,4,5,78,90,1,23};
        int[]arr2 = {-4,-3,-9};
        int[]arr3 = {5,-100};

        System.out.println(getMax(arr1));

        int array2MaxElement = getMax(arr2);
        System.out.println(array2MaxElement);

        int res = getMax(arr3);
        System.out.println(res);

        String[] fr = {"Apple","Orange","Plum","Peach"};
        String[] f = twoFirstElements(fr);

        System.out.println(f[0]+" "+f[1]);
    }


    public static void sayHelloToYou(){

        System.out.println("Hello, my friend");
    }

    public static int getMax(int[]arr){
        int max = arr[0];
        for(int v:arr){
            if(v>max){
                max=v;
            }
        }
        return max;
    }

    public static String[] twoFirstElements(String[]fruits){
        String[] arr = new String[2];
        arr[0] = fruits[0];
        arr[1] = fruits[1];
        return arr;
    }
}
