package dev.code.array;

public class SubarraysExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // Outer loop for starting index
        for (int start = 0; start < arr.length; start++) {
            // Inner loop for ending index
            for (int end = start; end < arr.length; end++) {
                // Print subarray from start to end
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(); // Move to next line for the next subarray
            }
        }
    }
}

