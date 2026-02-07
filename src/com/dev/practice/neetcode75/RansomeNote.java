package com.dev.practice.neetcode75;

public class RansomeNote {
    public static void main(String[] args) {
        System.out.println(sol("aa","aab"));
    }
    private static boolean sol(String ransomeNote, String magazine) {
        int[] count=new int[26];
        for(char c:magazine.toCharArray()) {
            count[c-'a']++;
        }
        for(char c:ransomeNote.toCharArray()){
            if(count[c-'a']==0) {
                return false;
            }
            count[c-'a']--;
        }
        return true;
    }
}
