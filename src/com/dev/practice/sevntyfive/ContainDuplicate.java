package com.dev.practice.sevntyfive;

import java.util.HashMap;

public class ContainDuplicate {
    public static void main(String[] args) {
        int [] nums={1,2,3,1};
        System.out.println(solu1(nums));
    }
    private static boolean solu1(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
