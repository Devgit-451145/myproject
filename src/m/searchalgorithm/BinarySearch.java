package m.searchalgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr= {1,3,4,6,9,11};
        int target=9;
        int result = binarySearch1(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
    private static int binarySearch1(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid; // Found!
            } else if (target < arr[mid]) {
                right = mid - 1; // Search left half
            } else {
                left = mid + 1; // Search right half
            }
        }
        return -1;
    }
}
