package m.dev.binarySearch;

public class BinarySearchAlg {
    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int target=9;
        int ind=binSea(arr,target);
        System.out.println(ind);
    }
    private static int binSea(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // To prevent overflow
            if (arr[mid] == target) {
                return mid; // Target found at index mid
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1;
    }
}
