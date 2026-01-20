package com.dev.practice.sevntyfive;

public class MinOperationsMakeArraySumDivByK {
    public static void main(String[] args) {
        int [] nums={3,9,7};
        int k=5;
        System.out.println(solution(nums,k));

        //System.out.println(19%5);//4
        //System.out.println(19/5);//3
    }

    private static int solution(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum=sum+nums[i];
        }
        //19%5 =
        return sum%k;
    }
}
