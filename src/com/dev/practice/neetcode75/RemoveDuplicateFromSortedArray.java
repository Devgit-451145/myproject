package com.dev.practice.neetcode75;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] nums={1,1,1,2,3,3,4};
        System.out.println(solution(nums));
    }
    private static boolean solution(int[] nums) {
        if(nums==null || nums.length==0) {
            return false;
        }
        int cnt=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[cnt]!=nums[i]) {
                cnt++;
                nums[cnt]=nums[i];
            }
        }
        for(int i=0;i<cnt+1;i++) {
            System.out.println(nums[i]+" ");
        }
        return false;
    }
}
