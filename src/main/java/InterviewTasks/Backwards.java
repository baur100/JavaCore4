package InterviewTasks;

public class Backwards {
    public static void main (String[] args){
        String str = "Life is good";
        backwards1(str);
        System.out.println();
        backward2(str);
        System.out.println();
        backward3(str);
    }

    public static void backwards1(String str) {
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }

    public static void backward2 (String str){
        char[] arr = str.toCharArray();
        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }

    public static void backward3 (String str){
        String[] arr2 = str.split(" ");
        for (int i = arr2.length-1; i>=0; i--){
            System.out.print(arr2[i]);
            System.out.print(" ");
        }
    }



}
