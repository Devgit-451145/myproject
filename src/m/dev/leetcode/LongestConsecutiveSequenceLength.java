package m.dev.leetcode;

import java.util.HashSet;

public class LongestConsecutiveSequenceLength {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2}; // Example array
        int longestLength = findLongestConsecutiveSequence(nums);
        System.out.println("The length of the longest consecutive sequence is: " + longestLength);
    }
    private static int findLongestConsecutiveSequence(int[] nums) {
        if(nums==null || nums.length<0) {
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(Integer num:nums){
           set.add(num);
        }
        int longestStreak=0;
        for (int num : nums) {
            if(!set.contains(num-1)) {
                int currentNum=num;
                int currentStreak=1;
                while (set.contains(currentNum+1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        System.out.println(longestStreak);
        return longestStreak;
    }


}
