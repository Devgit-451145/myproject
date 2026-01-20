package com.dev.practice.servicenow;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstNonRepUniqueChar {
    public static void main(String[] args) {
        String s="servicenow";
        System.out.println(firstUniqueChar(s));
        System.out.println(firstUniqueCharMap(s));

    }
    //TC ==O(N) SC==O(N)
    private static int firstUniqueCharMap(String s) {
       if(s==null || s.isEmpty()) {
           return -1;
       }
        Map<Character, Integer> map=new HashMap<>();
       for(char c:s.toCharArray()) {
           map.put(c, map.getOrDefault(c,0)+1);
       }
       for(int i=0;i<s.length();i++) {
           if(map.get(s.charAt(i))==1) {
               return i;
           }
       }
        return -1;
    }

    //TC==O(N) SC==0(1)
    public static int firstUniqueChar(String s) {
        if (s == null || s.isEmpty()) return -1;
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
