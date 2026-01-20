package com.dev.practice;

import java.util.HashMap;
import java.util.Map;

public class Haha {
    public static void main(String[] args) {
        String s="servicsenow";
        System.out.println(firstUniqueChar(s));
    }

    public static int firstUniqueChar(String s) {
        if (s == null || s.isEmpty()) return -1;
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

}
