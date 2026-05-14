package com.dev.practice.neetcode75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums={100,4,200,1,1,3,2};
        //System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutive1(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;
        for (int i = 1; i < nums.length; i++) {
            // if the current element is identical to the previous,
            // just continue through the iteration
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            // check for consecutive sequence
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak += 1;
            } else {
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }
        }
        return Math.max(longestStreak, currentStreak);
    }
    //Time Complexity: O(n), where n is the length of the array due to one pass through the elements
    // and constant time lookups.
    //Space Complexity: O(n), because of the space used by the HashSet.
    public static int longestConsecutive1(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestStreak = 0;
        for (int num : numSet) {
            // Check if num is the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                // Increment currentNum to count the length of sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
