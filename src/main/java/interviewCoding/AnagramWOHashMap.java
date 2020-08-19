package interviewCoding;

public class AnagramWOHashMap {

    public static void main(String[] args) {
        AnagramWOHashMap anagram1 = new AnagramWOHashMap();
        System.out.println(anagram1.isAnagram("anagram", "gram"));
        System.out.println(anagram1.isAnagram("Listen", "Silent "));
        System.out.println(anagram1.isAnagram("Astronomer", "Moon Starer."));
    }

    private boolean isAnagram(String str1, String str2) {
        int[] counts1 = getCharCount(str1);
        int[] counts2 = getCharCount(str1);

        for( int i=0; i<counts2.length; i++)
            if( counts2[i] > counts1[i] )
                return false;

        return true;
    }

    private int[] getCharCount(String str) {
        int[] counts = new int[256];

        for( char c : str.toLowerCase().toCharArray() )
            if( Character.isLetterOrDigit(c) )
                counts[c]++;

        return counts;
    }
}
