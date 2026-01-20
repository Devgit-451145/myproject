package com.dev.practice.sevntyfive;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(Arrays.toString(solution(nums)));
        System.out.println(Arrays.toString(solutionBf(nums)));
    }
    private static int[] solutionBf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            res[i] = prod;
        }
        return res;
    }
    private static int[] solution(int[] nums) {
        int n=nums.length;
        int ans[]=new int[nums.length];
        int prodL=1;
        int prodR=1;

        for(int i=n-1;i>=0;i--) {
            ans[i]=prodR;
            prodR=prodR*nums[i];
        }
        for(int i=0;i<n;i++) {
            ans[i]=ans[i]*prodL;
            prodL=prodL*nums[i];
        }
        return ans;
    }
}
