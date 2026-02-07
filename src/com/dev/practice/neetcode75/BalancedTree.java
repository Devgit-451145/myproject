package com.dev.practice.neetcode75;

public class BalancedTree {
    public static void main(String[] args) {
        System.out.println(sol("1234"));
    }

    private static boolean sol(String number) {
        int evenNum=0;
        int oddNum=0;
        for(int i=0;i<number.length();i++) {
            if(i%2==0) {
                evenNum+=number.charAt(i)-'0';
            } else {
                oddNum+=number.charAt(i)-'0';
            }
        }
        return evenNum==oddNum;
    }
}
