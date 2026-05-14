package com.dev.practice.neetcode75;


public class ClimbingStairs {
   // Time Complexity: O(2^n) → very slow
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
   //Time Complexity: O(n)
   //Space Complexity: O(n)
    public static int climbStairs1(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
        System.out.println(climbStairs1(n));
    }

}



