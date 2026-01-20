package com.dev.practice.sevntyfive;

public class MaxSubArrayOfSizeKSlidingWin {
    public static void main(String[] args) {
        int [] nums={2,9,31,-4,21,7};
        int k=3;
        System.out.println(solution(nums,k));
        System.out.println(slidingWindow(nums,k));
    }
    private static int slidingWindow(int[] nums, int k) {
        int wSum=0;
        int mSum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++) {
            wSum=wSum+nums[i];
        }
        for(int i=k;i<nums.length;i++) {
            wSum=wSum-nums[i-k]+nums[i];
            mSum=Math.max(mSum,wSum);
        }
        return mSum;
    }
    private static int solution(int[] nums, int k) {
        //int currSum=0;
        int maxSum=0;
        for(int i=0;i<nums.length-k;i++) {
            int currSum=0;
           for(int j=i;j<i+k;j++) {
               currSum+=nums[j];
           }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
