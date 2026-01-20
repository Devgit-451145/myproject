package com.dev.practice.neetcode75;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        //option 1
        //solution(nums,3);
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+" ");
        }
        //option 2
        //int[] nums1={10,20,30,40,50,60};
        sol(nums,3);
        //System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static void sol(int[] nums, int k) {
        k=k%nums.length;
        if(k<0) {
            k=k+nums.length;
        }
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    private static void reverse(int[] nums,int start,int end) {
        if(start<end) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
    private static void solution(int[] nums, int k) {
        //0 % 5=0, 1 % 5=1,2 % 5=2,3 % 5=3, 4 % 5=4, 5%5=0, 6%5=1,7%5=2
        k=k%nums.length;
        if(k<0) {
            k=k+nums.length;
        }
        for(int i=1;i<=k;i++) {
            rotateOne(nums);
        }
    }
    private static void rotateOne(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++) {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
}
