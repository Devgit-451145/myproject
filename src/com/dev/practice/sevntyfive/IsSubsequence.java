package com.dev.practice.sevntyfive;

public class IsSubsequence {
    //subsequence new string that is formed from the original string without distrubing relative position
    public static void main(String[] args) {
        System.out.println(solution("abc", "ahbgdc"));
    }
    private static boolean solution(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }
}
