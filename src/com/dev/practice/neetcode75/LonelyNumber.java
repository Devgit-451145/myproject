package com.dev.practice.neetcode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyNumber {
    public static void main(String[] args) {
        int[] nums={10,6,5,8};
        System.out.println(solution(nums));
    }
    private static List<Integer> solution(int[] nums) {
        List<Integer> reslut=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            } else {
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(map.get(nums[i])==1 && !map.containsKey(nums[i]+1) && !map.containsKey(nums[i]-1)) {
                reslut.add(nums[i]);
            }
        }
        System.out.println(reslut);
        return reslut;
    }
}
