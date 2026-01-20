package com.dev.practice.sevntyfive;

public class MaxSubArrayKadaneAlgo {
    public static void main(String[] args) {
        int [] nums={-1,3,4,-2};
        System.out.println(solutionBf(nums));
        System.out.println(solutionOptimal(nums));
    }
    //kadane algorithm
    private static int solutionOptimal(int[] nums) {
      int sum=nums[0];
      int maxSum=nums[0];
      for(int i=1;i<nums.length;i++){
          if(sum>=0){
              sum+=nums[i];
          } else {
              sum=nums[i];
          }
          maxSum=Math.max(sum,maxSum);
      }
      return maxSum;
    }
    //brute force approach
    private static int solutionBf(int[] nums) {
        int maxSum=0;
        for(int i=0;i<nums.length;i++) {
            int sum=0;
            for(int j=i;j<nums.length;j++) {
                sum=sum+nums[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
}

 //ex: -1,3,4,
 //sub arrays
 // -1
 // -1 ,3
 // -1. 3, 4
 //  3
 //  3,4