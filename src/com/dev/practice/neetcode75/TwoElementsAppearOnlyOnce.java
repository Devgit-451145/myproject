package com.dev.practice.neetcode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoElementsAppearOnlyOnce {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,4,4,5,6};
        System.out.println(Arrays.toString(solution(nums)));
    }

    private static int[] solution(int[] nums) {
        int[] two=new int[2];
        int index=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()==1) {
                two[index++]=entry.getKey();
            }
            if(index==2) {
                break;
            }
        }

        return two;
    }
}
