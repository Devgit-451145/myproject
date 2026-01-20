package com.dev.practice.neetcode75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateFindArray {
    public static void main(String[] args) {
        int [] nums={1,3,3,4,5};
        System.out.println(hasDuplicatesSet(nums));
        System.out.println(hasDuplicatesSort(nums));
        System.out.println(hasDuplicates(nums));
    }
    //time o(n^2) space o(1)
    private static boolean hasDuplicates(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1; j<nums.length;j++) {
                if(nums[i]==nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    //time complexity O(nlogn) space complexity O(1) or O(N)
    private static boolean hasDuplicatesSort(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    //space and time complexity O(N)
    private static boolean hasDuplicatesSet(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
