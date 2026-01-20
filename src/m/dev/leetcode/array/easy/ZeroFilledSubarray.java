package m.dev.leetcode.array.easy;

public class ZeroFilledSubarray {
    public static void main(String[] args) {
        int [] nums={1,2,3,0,0,1,2,0};
        System.out.println(zeroFilledSubarray(nums));
    }
    private static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        int n = nums.length;
        // Check each subarray starting at index `i`
        for (int i = 0; i < n; i++) {
            // Track contiguous zeroes starting from index `i`
            for (int j = i; j < n && nums[j] == 0; j++) {
                // Increment count each time a zero-filled subarray is found
                count++;
            }
        }
        return count;
    }
}
