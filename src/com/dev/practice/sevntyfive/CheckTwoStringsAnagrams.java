package com.dev.practice.sevntyfive;

import java.util.Arrays;

public class CheckTwoStringsAnagrams {
    public static void main(String[] args) {
        System.out.println(solution("keep","peek"));
    }
    private static boolean solution(String s, String s1) {
        if(s1.length()!=s.length()) {
            return false;
        }
        char[] ch1=s.toCharArray();
        char[] ch2=s1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)) {
            return true;
        }
        return false;
    }
}
