package com.dev.practice.neetcode75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDisappearedElementsInArray {
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};
        //System.out.println(findAny(nums));
       // System.out.println(findDisappearedNumbers(nums));
         System.out.println(findDisappearedNumbersSet(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            seen[num] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }
        return result;
    }

    //o(n) 0(1)
    private static List<Integer> findAny(int[] nums) {
        List<Integer> missedList=new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
             int index=Math.abs(nums[i])-1;
            if(nums[index]>0) {
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                missedList.add(i+1);
            }
        }
        return missedList;
    }
    public static List<Integer> findDisappearedNumbersSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

}
