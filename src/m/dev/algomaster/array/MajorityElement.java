package m.dev.algomaster.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums={2,1,2,1,1};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement1(nums));
        System.out.println(majorityElement2(nums));
    }
   //moore algorithm
    private static int majorityElement2(int[] nums) {
        int candidate=nums[0];
        int count=0;
        for(int num:nums) {
            if(count==0) {
                candidate=num;
            }
            if(candidate==num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    //BOTH O(N) -Map approach
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            // If an element's count exceeds n/2, return it
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1; // Shouldn't reach here if input is valid
    }
    //brute force
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
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1; // Should never be reached if majority element assumption holds
    }
}
