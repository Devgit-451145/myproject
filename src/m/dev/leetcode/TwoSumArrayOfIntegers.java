package m.dev.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArrayOfIntegers {
    public static void main(String[] args) {
        //input [2,7,11,15],target=9
        //output =[0,1]
        //numc[0]+nums[1] ==9 retrin [0,1]
        //approach 1
        int nums[] ={2,7,11,15};
        int target =26;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    System.out.println(Arrays.toString(new int[]{i, j}));
                }
            }
        }
       //approach 2 hashmap
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            Integer cIndex=map.get(nums[i]);
            if(cIndex!=null) {
                System.out.println(Arrays.toString(new int[]{i, cIndex}));
                return;
            }
            map.put(target-nums[i],i);

        }
        //approach 3
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int complement=target-nums[i];
            if(map.containsKey(complement)) {
                //return new in [] {hashMap.get(complement),i};
            }
            map.put(nums[i],i);
        }
        //return new int[]{};
    }
}
