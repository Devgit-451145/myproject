package com.dev.practice.sevntyfive;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(solu(s));
    }
    private static boolean solu(String s) {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int start=0;
        int end=s.length()-1;
        while(start<end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
