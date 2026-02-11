package com.dev.practice.neetcode75;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,7,5};
        //kadane
        System.out.println(solution(nums));
        //bruteforce
        System.out.println(solution1(nums));
    }
    private static int solution1(int[] arr) {
        if(arr==null || arr.length<0) return 0;
        int mSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                mSum = Math.max(mSum, currentSum);
            }
        }
        return mSum;
    }
    private static int solution(int[] a) {
        int sum=a[0];
        int maxSum=a[0];
        for(int i=0;i<a.length;i++) {
            //join
            if(sum>=0) {
                sum+=a[i];
            } else {
                //dont join
                sum=a[i];
            }
            if(sum>maxSum) {
                maxSum=sum;
            }
        }
        return maxSum;
    }

}
