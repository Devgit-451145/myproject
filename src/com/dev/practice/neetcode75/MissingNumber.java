package com.dev.practice.neetcode75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums={1,3,0};
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
    //TC==O(N) SC==0(1)
    public static int missingNumber(int[] nums) {
        // Edge case: empty array
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    //o(n)
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // Add all nums into the HashSet
        for (int num : nums) {
            set.add(num);
        }
        // Check from 1 to infinite for the first missing number
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1; // The function should never reach here
    }
}
