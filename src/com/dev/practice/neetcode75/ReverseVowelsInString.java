package com.dev.practice.neetcode75;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        System.out.println(solution("hellow"));
    }
    private static String solution(String s) {
        char[] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end) {
            if(!isVowel(ch[start])) {
                start++;
            } else if(!isVowel(ch[end])) {
                end--;
            } else {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    private static boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
