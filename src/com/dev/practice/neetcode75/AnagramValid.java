package com.dev.practice.neetcode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramValid {
    public static void main(String[] args) {
        String s1="racecar"; String s2="carrace";
        System.out.println(isAnagramSort(s1,s2));
        System.out.println(isAnagramMap(s1,s2));
        System.out.println(isAnagramHt(s1,s2));
    }
    //TC==O(N+M) SC=o(1)
    private static boolean isAnagramHt(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int [] count=new int[26];
        for(int i=0;i<s1.length();i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for(int val:count) {
            if(val!=0) {
                return false;
            }
        }
        return true;
    }

    //SC==O(N)  TC==O(N+M)
    private static boolean isAnagramMap(String s1, String s2) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++) {
            map1.put(s1.charAt(i),map1.getOrDefault(0,1)+1);
            map2.put(s2.charAt(i),map2.getOrDefault(0,1)+1);
        }
        return map1.equals(map2);
    }
    //TC=onlogn  SC=O(1)
    private static boolean isAnagramSort(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;

        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
