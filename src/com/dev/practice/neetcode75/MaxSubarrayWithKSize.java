package com.dev.practice.neetcode75;

public class MaxSubarrayWithKSize {
    public static void main(String[] args) {
        int a[]={2,9,31,-4,21,7};
        int k=3;
        //sliding window
        System.out.println(solution(a,k));
        //brusteforece
        System.out.println(solution1(a,k));
    }

    private static int solution1(int[] a, int k) {
        int mSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length-k;i++) {
            int cSum=0;
            for(int j=i;j<i+k;j++) {
                cSum=cSum+a[j];
                mSum=Math.max(cSum,mSum);
            }
        }
        return mSum;
    }

    private static int solution(int[] a, int k) {
        int wSum=0;
        int mSum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++) {
            wSum+=a[i];
        }
        for(int i=k;i<a.length;i++) {
            wSum=wSum-a[i-k]+a[i];
            mSum=Math.max(mSum,wSum);
        }
        return mSum;
    }
}
