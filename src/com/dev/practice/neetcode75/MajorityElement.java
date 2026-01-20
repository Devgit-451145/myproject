package com.dev.practice.neetcode75;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,3,2};
        System.out.println(sol(nums));
        System.out.println(sol1(nums));
    }

    private static int sol1(int[] nums) {
        int cand=0;
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(count==0) {
                cand=nums[i];
            }
            if(cand==nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return cand;
    }

    //3/2=1.5=1 lenght of array/2 will give
    private static int sol(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                if(map.get(nums[i])>nums.length/2) {
                    return nums[i];
                }
        }
        /*for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }*/
        return 0;
    }
}
