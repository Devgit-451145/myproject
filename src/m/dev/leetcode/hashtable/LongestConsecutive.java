package m.dev.leetcode.hashtable;

import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int [] nums={100,4,4,1,3,2};
        System.out.println(longestConsecutive(nums));

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

}
