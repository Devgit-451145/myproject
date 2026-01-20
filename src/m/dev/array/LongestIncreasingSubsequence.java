package m.dev.array;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] sequence = {10, 9, 2, 5, 3, 7, 101, 18};
        int length = longestIncreasingSubsequence(sequence);
        System.out.println("Length of Longest Increasing Subsequence: " + length);
    }
    private static int longestIncreasingSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);// Each element is an increasing subsequence of length 1
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        // The length of the longest increasing subsequence is the maximum value in dp
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
