package interviewCoding;

import java.util.HashMap;

public class AnagramsWithHashMap {

    public static void main(String[] args) {

        System.out.println("\n*************\n");
        System.out.println(isAnagram(getCharCount("Anagram"),
                getCharCount("margana")));

        System.out.println("\n*************\n");
        System.out.println(isAnagram(getCharCount("Listen"),
                getCharCount("Silent")));

        System.out.println("\n*************\n");
        System.out.println(isAnagram(getCharCount("School master"),
                getCharCount("The classroom")));

        System.out.println("\n*************\n");
        System.out.println(isAnagram(getCharCount("Astronomer"),
                getCharCount("Moon starer.")));

        System.out.println("\n*************\n");
        System.out.println(isAnagram(getCharCount("Null"),
                getCharCount("")));

        System.out.println("\n*************\n");
    }

    public static HashMap getCharCount(String word1){

        HashMap <Character,Integer> hWord1 = new HashMap<Character, Integer>();

        char[] cArWrd = word1.toLowerCase().toCharArray();
        int count = 1, increment = 1;
        for (char a : cArWrd) {
            if(Character.isLetterOrDigit(a)) {
                if (hWord1.containsKey(a)) {
                    increment = hWord1.get(a) + 1;
                    hWord1.replace(a, increment);
                } else {
                    hWord1.put(a, count);
                }
            }else
                continue;
        }

        System.out.println("word1 = " + word1);
        return hWord1;
    }


    public static boolean isAnagram(HashMap<Character,Integer> hW1, HashMap<Character,Integer> hW2){
        System.out.println("\nhW1 = " + hW1 + ", hW2 = " + hW2);
        for (char key : hW2.keySet()) {
           if(hW2.get(key) > hW1.get(key))
               return false;
        }
        return true;
    }
}
