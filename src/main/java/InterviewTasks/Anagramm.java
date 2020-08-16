package InterviewTasks;

import java.util.Arrays;

public class Anagramm {
    public static void main (String [] args){
        String str1 = "slow";
        String str2 = "Lows";
        boolean result = isAnagram (str1, str2);
        System.out.println(result);
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length()!=str2.length()){
            return false;
        }
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i<=arr1.length-1; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
