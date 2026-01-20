package com.dev.practice.sevntyfive;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(solu(5));
    }

    private static int solu(int n) {
        if(n<=3) {
            return n;
        }
        int a=3,b=2;
        for(int i=0;i<n-3;i++) {
            a=a+b;
            b=a-b;
        }
        return a;
    }
}
