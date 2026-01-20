package m.dev.subsequence;

public class SubsequenceCheck {
    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0; // Pointer for string s
        int tIndex = 0; // Pointer for string t
        while (sIndex < s.length() && tIndex < t.length()) {
            // If characters match, move the pointer for s
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            // Always move the pointer for t
            tIndex++;
        }
        // If we have traversed all characters in s, it is a subsequence
        return sIndex == s.length();
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean result = isSubsequence(s, t);
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? " + result); // Output: true
    }
}
