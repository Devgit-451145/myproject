package com.dev.practice.sevntyfive;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String s="abba";
        String s1="dog cat cat dev";
        System.out.println(solu(s,s1));
    }

    private static boolean solu(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String [] arr=s.split(" ");
        if(pattern.length()!= arr.length) {
            return false;
        }
        for(int i=0;i<pattern.length();i++) {
            char ch=pattern.charAt(i);
            boolean containKey=map.containsKey(ch);
            if(map.containsValue(arr[i]) && !containKey) {
                return false;
            }
            if(containKey && !map.get(ch).equals(arr[i])) {
                return false;
            }
            else {
                map.put(ch,arr[i]);
            }
        }
        return true;
    }
}
