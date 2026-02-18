package com.dev.practice.sevntyfive;

public class ReverseWordsInString {
    public static void main(String[] args) {

        System.out.println(reverseWords("Hellow world"));
    }
    //both o(n)
    public static String reverseWords(String s) {
        // Step 1: Split the input string on spaces
        String[] words = s.trim().split("\\s+");
        // Step 2: Use StringBuilder to construct the result efficiently
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
