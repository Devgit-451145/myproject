package m.dev.leetcode.string.easy;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        boolean s=isPolindrome("deda");
        System.out.println(s);
    }
    private static boolean isPolindrome(String s) {
        Arrays.sort(s.toCharArray());
        System.out.println(s);
        return false;
    }
}
