package m.dev.array;

import java.util.HashMap;

public class TwoSumSorted {
    public static void main(String[] args) {
        //you can use the two-pointer technique
        int[] nums = {2, 7,11,15}; // Example sorted input array
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result.length > 0) {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
