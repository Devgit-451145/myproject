package com.dev.practice.neetcode75;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums={0,1,2,4,5,6};
        System.out.println(solution1(nums));
        System.out.println(missingNumber(nums));

    }
    private static int solution1(int[] n) {
        Arrays.sort(n);
       for(int i=0;i<n.length;i++) {
           if(n[i]!=i) {
               return i;
           }
       }
        return 0;
    }
    public static int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }
        return res;
    }

}
