package com.dev.practice.neetcode75;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedElementsInArray {
    public static void main(String[] args) {
        int [] nums={1,1};
        System.out.println(findAny(nums));
        System.out.println(findAnyExtraSpace(nums));
    }
    private static List<Integer> findAnyExtraSpace(int[] nums) {
        List<Integer> results=new ArrayList<>();
        boolean [] present=new boolean[nums.length+1];
        for(int i=1;i<nums.length;i++) {
            present[nums[i]]=true;
        }
        for(int i=1;i<=nums.length;i++) {
            if(!present[i]) {
                results.add(i);
            }
        }
        return results;
    }

    //o(n) 0(1)
    private static List<Integer> findAny(int[] nums) {
        List<Integer> missedList=new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            System.out.println(Math.abs(nums[i]));
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

}
