package com.dev.practice.sevntyfive;

public class IsSubsequence {
    //subsequence new string that is formed from the original string without distrubing relative position
    public static void main(String[] args) {
        System.out.println(solution("abc", "ahbgdc"));
    }
    //O(N) and O(1)
    private static boolean solution(String s, String t) {
        int i = 0, j = 0;
        // Iterate through both strings
        while (i < s.length() && j < t.length()) {
            // If characters match, move the pointer for s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move the pointer for t
            j++;
        }
        // If i is equal to the length of s, all characters of s were found in t
        return i == s.length();
    }
}
