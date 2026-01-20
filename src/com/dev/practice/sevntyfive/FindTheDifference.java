package com.dev.practice.sevntyfive;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(solutions("abcd","abcde"));
    }
    private static char solutions(String s, String t) {
        int total=0;
        for(int i=0;i<t.length();i++) {
            total=total+t.charAt(i);
        }
        for(int i=0;i<s.length();i++) {
            total=total-s.charAt(i);
        }
        return (char) total;

    }
}
