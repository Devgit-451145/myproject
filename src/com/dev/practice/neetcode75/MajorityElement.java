package com.dev.practice.neetcode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,3,2};
        System.out.println(sol(nums));
        System.out.println(sol1(nums));
        System.out.println(sol2(nums));
    }
    //Time Complexity: O(n log n) due to sorting.
    //Space Complexity: O(1) when using in-place sorting (ignoring input space).
    private static int sol2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    //Time Complexity: O(n) since it passes through the array once.
    //Space Complexity: O(1) since only a few additional variables are used.
    private static int sol1(int[] nums) {
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(count==0) {
                candidate=nums[i];
            }
            //count =count+(num[i] == candidate) ? 1 : -1;
            if(candidate==nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    //Time Complexity: O(n) because we iterate over the array once.
    //Space Complexity: O(n) because we might store all elements in the map in the worst case.
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
