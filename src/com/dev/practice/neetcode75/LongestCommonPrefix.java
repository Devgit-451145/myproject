package com.dev.practice.neetcode75;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs={"flower","flow","flight"};
        System.out.println(solution(strs));
    }
    private static String solution(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int index=0;
        while (index<s1.length()) {
            if(s1.charAt(index)==s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index==0 ? "" : s1.substring(0,index);
    }
}
