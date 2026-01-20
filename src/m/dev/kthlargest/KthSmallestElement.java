package m.dev.kthlargest;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {
        public static int findKthSmallest(int[] nums, int k) {
           //approach 1
            Arrays.sort(nums);
            System.out.println(nums[k - 1]); // k-th smallest is at index (k - 1)
            //appraoc 2 heap
            // Create a max-heap
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            // Add elements to the max-heap
            for (int num : nums) {
                maxHeap.offer(num);
                // Ensure the heap size does not exceed k
                if (maxHeap.size() > k) {
                    maxHeap.poll(); // Remove the largest element
                }
            }
            return maxHeap.peek();
        }
        //apprach 1
        public static void main(String[] args) {
            int[] arr = {3, 2, 1, 5, 6, 4};
            int k = 2;
            int result = findKthSmallest(arr, k);
            System.out.println("The " + k + "-th smallest element is: " + result);
        }
}
