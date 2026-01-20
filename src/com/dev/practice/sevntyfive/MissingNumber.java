package com.dev.practice.sevntyfive;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums={0,1,3,4,5};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber1(nums));
    }

    private static int missingNumber1(int[] arr) {
        int sumOfArray = 0;
        for (int num : arr) {
            sumOfArray += num;
        }
        int n=arr.length;
        int expectedSum = n * (n + 1) / 2;
        int missingNumber = expectedSum - sumOfArray;

        System.out.println("Missing number is: " + missingNumber);
        return missingNumber;
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}
