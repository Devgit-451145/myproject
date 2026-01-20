package m.dev.javastring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    //listen" is an anagram of "silent."
    public static void main(String[] args) {
        //approach 1
         boolean b=ana("listen","silent");
         //approach 2
        //ana1("listen","silent");
        System.out.println(b);
    }

//approach 2
    private static boolean ana(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
