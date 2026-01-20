package com.dev.practice.neetcode75;

public class FindIndexFirstOccuranceInString {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="sad";
        System.out.println(sol(haystack,needle));
        System.out.println(sol1(haystack,needle));
    }
    //
    private static int sol1(String haystack, String needle) {
        if(haystack!=null )
        for(int i=0;i<haystack.length()-needle.length()+1;i++) {
            if(haystack.charAt(i)==needle.charAt(0)) {
                if(haystack.substring(i,needle.length()+i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static int sol(String haystack, String needle) {
          return haystack.indexOf(needle);
    }
}
