package com.dev.practice.neetcode75;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(bruteForce(s));
        System.out.println(lengthOfLongestSubstring(s));
    }
    private static int bruteForce(String s) {
        int maxLength=0;
        //System.out.println(s.indexOf("a"));
        for(int i=0;i<s.length();i++) {
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++) {
                if(sb.indexOf(String.valueOf(s.charAt(j)))!=-1){
                    break;
                }
                sb.append(s.charAt(j));
                maxLength=Math.max(maxLength,sb.length());
            }
        }
        return maxLength;
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                // Move left pointer to avoid repeating character
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
