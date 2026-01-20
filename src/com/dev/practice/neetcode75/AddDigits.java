package com.dev.practice.neetcode75;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(358));
    }
    private static int addDigits(int num) {
        if(num==0) {
            return 0;
        }
        return (num%9==0) ? 9 : num%9;
    }
}
