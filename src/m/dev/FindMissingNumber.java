package m.dev;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4}; // Missing numbers: 5, 6
        List<Integer> missingNumbers = findMissingNumbers(arr);
        System.out.println("The missing numbers are: " + missingNumbers);
    }
    private static List<Integer> findMissingNumbers(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1]; // Boolean array to track presence
        // Mark the numbers present in the array
        for (int num : nums) {
            if (num <= n) {
                present[num] = true;
            }
        }
        // Find the missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

}
