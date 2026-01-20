package com.dev.practice.sevntyfive;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharSlidingWin {
    public static void main(String[] args) {
        System.out.println(solution("abcabcbb"));
    }
    //sliding window
    private static int solution(String str) {
        List<Character> list=new ArrayList<>();
        int start=0;
        int end=0;
        int maxLength=0;
        while (end<str.length()) {
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                maxLength=Math.max(maxLength,list.size());
            } else {
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        return maxLength;
    }
}
