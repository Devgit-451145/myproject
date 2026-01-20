package com.dev.practice.neetcode75;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqCharInString {
    public static void main(String[] args) {
        System.out.println(solution("leetcode"));
        System.out.println(solution1("leetcode"));
    }
    private static int solution1(String s) {
        char[] chars=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:chars) {
            if(map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else {
                map.put(c,1);
            }
        }
        for(int i=0;i<chars.length;i++) {
            if(map.get(chars[i])==1) {
                return i;
            }
        }
        return -1;
    }
    private static int solution(String s) {
        int[] freq=new int[26];
        char[] chars=s.toCharArray();
        for(char c: chars){
            freq[c-'a']++;
        }
        for(int i=0;i<chars.length;i++) {
            if(freq[chars[i]-'a']==1) {
                return i;
            }
        }
        return -1;
    }
}
