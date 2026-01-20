package m.dev.kthlargest;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        //approach 1 with sorting
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        int result = findKthLargest(arr, k);
        System.out.println("The " + k + "-th largest element is: " + result);
        //approach 2 witout sorting
        int[] arr1 = {3, 2, 1, 5, 6, 4};
        int result1 = findKthLargestMinHeap(arr1, k);
        System.out.println(result1);
    }

    private static int findKthLargestMinHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            minHeap.offer(num);//add
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element in the heap
            }
        }
        return minHeap.peek(); //view head of the quee
    }
    //approach min heap algorithm
    private static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
}
