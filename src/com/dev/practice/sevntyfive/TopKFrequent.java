package com.dev.practice.sevntyfive;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,3,3};
        int k = 2;
        System.out.println(topKFrequent(nums,k));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int num:nums) {
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()) {
            minHeap.offer(entry);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        System.out.println(minHeap);
//return null;
        return nums;
    }
}
