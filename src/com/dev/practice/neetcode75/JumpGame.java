package com.dev.practice.neetcode75;

public class JumpGame {
    public static void main(String[] args) {
        //int[] nums={2,3,1,1,4};
        int[] nums={3,2,1,0,4};
        System.out.println(solution(nums));
    }
    private static boolean solution(int[] nums) {
        int lastPos=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=lastPos) {
                lastPos=i;
            }
        }
        return lastPos==0;
    }
}
