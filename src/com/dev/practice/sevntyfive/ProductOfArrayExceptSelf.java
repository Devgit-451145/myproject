package com.dev.practice.sevntyfive;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(Arrays.toString(solution(nums)));
        System.out.println(Arrays.toString(solutionBf(nums)));
    }
    //TC==O(N2) SC==O(1)
    private static int[] solutionBf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = 1;  // Initialize each element as 1 for multiplication
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    output[i] *= nums[j];
                }
            }
        }
        return output;
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
