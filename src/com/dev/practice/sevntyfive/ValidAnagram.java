package com.dev.practice.sevntyfive;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(solutions("dev","evd"));
        System.out.println(solutions1("dev","evd"));

    }
    private static boolean solutions1(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++) {
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<count.length;i++)  {
            if(count[i]!=0) {
                return false;
            }
        }
        return true;
    }
    private static boolean solutions(String s, String t) {
     char [] a=s.toCharArray();
     char [] b=t.toCharArray();
     Arrays.sort(a);
     Arrays.sort(b);
     return Arrays.equals(a,b);
    }
}
