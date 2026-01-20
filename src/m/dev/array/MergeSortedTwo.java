package m.dev.array;

public class MergeSortedTwo {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  // Pointer for the last valid element in nums1
        int j = n - 1;  // Pointer for the last element in nums2
        int k = m + n - 1;  // Pointer for the last position in nums1

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are any elements left in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // If there are any elements left in nums1, they are already in place.
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
