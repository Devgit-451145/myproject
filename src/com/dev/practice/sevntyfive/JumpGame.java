package com.dev.practice.sevntyfive;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(sol(nums));
    }
    private static boolean sol(int[] nums) {
        int lastPosition=nums.length-1;
        for(int i=nums.length-2;i>=0;i--) {
            if(i+nums[i]>=lastPosition) {
                lastPosition=i;
            }
        }
        return lastPosition==0;
    }
}
