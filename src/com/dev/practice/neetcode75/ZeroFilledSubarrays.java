package com.dev.practice.neetcode75;

public class ZeroFilledSubarrays {
    public static void main(String[] args) {
        int [] nums={1,3,0,0,2,0,0,4};
        System.out.println(bf(nums));
    }
    //Time Complexity: O(n^2) - As we check each subarray which takes quadratic time.
    //Space Complexity: O(1) - No additional space is used beyond input size.
    private static long bf(int[] nums) {
        long count=0;
        int n=nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n && nums[j]==0; j++) {
                count++;
            }
        }
        return count;
    }
}
