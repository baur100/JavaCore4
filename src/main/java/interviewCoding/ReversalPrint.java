package interviewCoding;

public class ReversalPrint {

    public static void main(String[] args) {
        justPrintCharReverse("English is a Language");
        System.out.println("\n");
        System.out.println(printCharReverse("I'm a string to be tested!"));
        System.out.println("\n");
        printStringReverse("Hello, ? I am tired");
        System.out.println("\n\n");
    }

    public static char[] printCharReverse(String input){
        char[] sentChar = input.toCharArray(),
            revChar = new char[sentChar.length];
        for (int i=sentChar.length-1 ; i>=0; i--)
            revChar[sentChar.length-1-i] = sentChar[i];
        return revChar;
    }

    public static void justPrintCharReverse(String input){
        for(int i = input.length()-1;i>=0;i--)
            System.out.print(input.charAt(i));
    }

    public static String[] printStringReverse(String input){
        String words[] = input.split(" "),
               revWords[] = new String[words.length];
        if(!(input.isBlank() || input.isEmpty())) {
            for (int i = words.length - 1; i >= 0; i--){
                revWords[words.length-1-i] = words[i];
                System.out.print(" " + words[i]);
            }
        }
        return revWords;
    }
}
