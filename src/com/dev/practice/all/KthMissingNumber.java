package com.dev.practice.all;

public class KthMissingNumber {

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int missing = arr[i] - (i + 1);
            if (missing >= k) {
                return i + k;
            }
        }
        // If kth missing is beyond last element
        return n + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));  // Output: 9
    }
}

