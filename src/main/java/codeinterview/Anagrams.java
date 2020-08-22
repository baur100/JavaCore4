package codeinterview;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String word1 = "cinema1";
        String word2 = "ic1eman";
        boolean result = isAnagram(word1,word2);
        System.out.println(result);
    }

    private static boolean isAnagram(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        char[]arr1 = word1.toLowerCase().toCharArray();
        char[]arr2 = word2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i< arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
