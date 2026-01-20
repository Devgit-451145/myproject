package m.dev;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "marru";
        String str2 = "rurma";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    private static boolean areAnagrams(String str1, String str2) {
        // Normalize the strings -remove spaces
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if(str1.length()!=str2.length()) {
            return false;
        }
        char[] m1=str1.toCharArray();
        char[] m2=str2.toCharArray();
        Arrays.sort(m1);
        Arrays.sort(m2);
        return Arrays.equals(m1,m2);
    }
}
