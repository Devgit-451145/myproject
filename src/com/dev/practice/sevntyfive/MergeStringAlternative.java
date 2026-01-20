package com.dev.practice.sevntyfive;

//LC1768
public class MergeStringAlternative {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(sol(word1,word2));
    }
    private static String sol(String word1, String word2) {
        int i=0;
        StringBuilder builder=new StringBuilder();
        while(i<word1.length() || i<word2.length()) {
            if(i<word1.length()) {
                builder.append(word1.charAt(i));
            }
            if(i<word2.length()) {
                builder.append(word2.charAt(i));
            }
            i++;
        }
        return builder.toString();
    }
}
