package m.dev.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7,8,3};
        System.out.println(majorityElement1(nums));
    }
    private static int majarotyElements(int[] nums) {
        int majority=nums[0];
        int votes=0;
        for(int i=1;i<nums.length;i++) {
            if(votes==0) {
                votes++;
                majority=nums[i];
            } else if(majority==nums[i]){
              votes++;
            } else {
                votes--;
            }
        }
        //System.out.println(majority);
        return majority;
    }
    public static int majorityElement1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            // Count occurrences of nums[i]
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            // If count exceed n/2, nums[i] is the majority element
            //System.out.println(n/2);
            if (count > n / 2) {
                //System.out.println(nums[i]);
                return nums[i];
            }
        }
        return -1; // Should never be reached if majority element assumption holds
    }
}
