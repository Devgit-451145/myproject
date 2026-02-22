package com.dev.practice.neetcode75;

import java.util.Arrays;

public class ProductOfArrayItself {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(Arrays.toString(solution(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    //BRUTE FORCE
    private static int [] solution(int[] nums) {
       int n=nums.length;
       int[] result=new int[n];
       for(int i=0;i<n;i++) {
           result[i]=1;
           for(int j=0;j<n;j++) {
               if(i!=j) {
                   result[i] *= nums[j];
               }
           }
       }
        return result;
    }
    //Time Complexity: O(n) because it involves two passes over the array.
    //Space Complexity: O(1) extra space apart from the output array.
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        // Initialize the output array with left products
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        // Calculate and multiply the right products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }

}
