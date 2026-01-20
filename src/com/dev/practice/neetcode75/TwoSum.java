package com.dev.practice.neetcode75;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
       int [] nums = {3,4,5,6};
       int target = 7;
       System.out.println(Arrays.toString(twoSum1(nums, target)));
       System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    private static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> myMap=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int num=nums[i];
            int diff=target-num;
            if(myMap.containsKey(diff)) {
                return new int[]{myMap.get(diff),i};
            } else {
                myMap.put(num,i);
            }
        }
        return new int[0];
    }

    //TC=O(N^2) sc=0(1)
    private static int [] twoSum1(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
