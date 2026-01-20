package com.dev.practice.neetcode75;

public class PrintSubArray {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        solution(nums);
    }
    private static void solution(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
                for(int k=i;k<=j;k++) {
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
