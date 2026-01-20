package com.dev.practice.sevntyfive;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));    // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));   // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
    private static String gcdOfStrings(String str1, String str2) {
        // If concatenating in different orders gives different results,
        // there is no common divisor string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // Compute gcd of lengths
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    // Euclidean algorithm for gcd of two integers
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
