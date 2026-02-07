package com.dev.practice.neetcode75;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(358));
        System.out.println(addDigits1(358));
    }
    private static int addDigits1(int num) {
        int sum=0;
        while (num != 0) {
            sum += num % 10; // get last digit
            num /= 10;       // remove last digit
        }
        System.out.println("Sum of digits = " + sum);
        return sum;
    }
    //using string conversion
    private static int addDigits(int num) {
        int sum=0;
        for(char c:String.valueOf(num).toCharArray()) {
            sum+=c-'0';
        }
      return sum;
    }
}
