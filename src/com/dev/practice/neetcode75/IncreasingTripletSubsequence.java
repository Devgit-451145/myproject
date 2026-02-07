package com.dev.practice.neetcode75;

//Given an integer array nums, return true if there exists a triple of indices (i, j, k)
// such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        System.out.println(bf(nums));
        System.out.println(solu(nums));
    }
    //Time Complexity: O(n), where n is the number of elements in the array. We only require one pass through the array.
    //Space Complexity: O(1), since we are using only a constant amount of additional space.
    private static boolean solu(int[] nums) {
        // Initialize the first and second variables to the maximum possible value
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        // Traverse the array
        for (int num : nums) {
            // If current number is less than or equal to the first, update first
            if (num <= first) {
                first = num;
                // Else if current number is less than or equal to the second, update second
            } else if (num <= second) {
                second = num;
                // Else we found a number greater than both first and second
            } else {
                return true;
            }
        }
        return false;
    }
    //Time Complexity: O(n^3), due to the three nested loops over the array.
    //Space Complexity: O(1), since we are not using any additional data structures.
    static boolean bf(int[] nums) {
        int n = nums.length;
        // Iterate over the array to find the first number
        for (int i = 0; i < n - 2; i++) {
            // Iterate to find the second number which is greater than the first
            for (int j = i + 1; j < n - 1; j++) {
                // Iterate to find the third number which is greater than the second
                for (int k = j + 1; k < n; k++) {
                    // Check if this is an increasing triplet
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    }

